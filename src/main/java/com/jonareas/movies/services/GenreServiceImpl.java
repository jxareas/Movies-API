package com.jonareas.movies.services;

import com.jonareas.movies.entities.Genre;
import com.jonareas.movies.repositories.GenreRepository;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl extends BaseServiceImpl<Genre, Long, GenreRepository> implements GenreService
{

    GenreServiceImpl(GenreRepository repository) {
        super(repository);
    }

}