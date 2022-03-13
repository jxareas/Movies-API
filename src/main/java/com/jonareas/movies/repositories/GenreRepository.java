package com.jonareas.movies.repositories;

import com.jonareas.movies.entities.Genre;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends BaseRepository<Genre, Long>  {

}
