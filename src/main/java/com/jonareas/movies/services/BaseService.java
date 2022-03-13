package com.jonareas.movies.services;

import com.jonareas.movies.entities.BaseEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseService<T extends BaseEntity, ID extends Serializable> {

    public List<T> findAll() throws Exception;

    public Optional<T> findById(ID id) throws Exception;

    public T save(T entity) throws Exception;

    public T update(ID id, T entity) throws Exception;

    public boolean delete(ID id) throws Exception;

}
