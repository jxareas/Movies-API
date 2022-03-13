package com.jonareas.movies.services;

import com.jonareas.movies.entities.BaseEntity;
import com.jonareas.movies.repositories.BaseRepository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class BaseServiceImpl<T extends BaseEntity, ID extends Serializable, TRepository extends BaseRepository<T, ID>>
        implements BaseService<T, ID> {

    protected TRepository repository;

    BaseServiceImpl(TRepository repository) {
        this.repository = repository;
    }

    @Override @Transactional
    public List<T> findAll() throws Exception {
        try {
            return repository.findAll();
        } catch (Exception exception) {
            throw new Exception(exception.getMessage());
        }
    }

    @Override @Transactional
    public Optional<T> findById(ID id) throws Exception {
        try {
            return repository.findById(id);
        } catch(Exception exception) {
            throw new Exception(exception.getMessage());
        }
    }

    @Override @Transactional
    public T save(T entity) throws Exception {
        try {
            return repository.save(entity);
        } catch (Exception exception) {
            throw new Exception(exception.getMessage());
        }
    }

    @Override @Transactional
    public T update(ID id, T entity) throws Exception {
        try {
            Optional<T> entityOptional = repository.findById(id);
            T updatedEntity = entityOptional.get();
            updatedEntity = repository.save(entity);
            return updatedEntity;
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (repository.existsById(id)) {
                repository.deleteById(id);
                return true;
            } else throw new Exception();
        } catch(Exception exception) {
            throw new Exception(exception.getMessage());
        }
    }
}
