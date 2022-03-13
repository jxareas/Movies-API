package com.jonareas.movies.services;

import com.jonareas.movies.entities.Movie;
import com.jonareas.movies.repositories.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl extends BaseServiceImpl<Movie, Long, MovieRepository> implements MovieService {

    MovieServiceImpl(MovieRepository repository) {
        super(repository);
    }
}
