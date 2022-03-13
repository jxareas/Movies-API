package com.jonareas.movies.repositories;

import com.jonareas.movies.entities.Movie;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends BaseRepository<Movie, Long> {
}
