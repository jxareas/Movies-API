package com.jonareas.movies.services;

import com.jonareas.movies.entities.Nationality;
import com.jonareas.movies.repositories.NationalityRepository;
import org.springframework.stereotype.Service;

@Service
public class NationalityServiceImpl extends BaseServiceImpl<Nationality, Long, NationalityRepository> implements NationalityService
{

    NationalityServiceImpl(NationalityRepository repository) {
        super(repository);
    }
}