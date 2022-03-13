package com.jonareas.movies.repositories;

import com.jonareas.movies.entities.Nationality;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalityRepository  extends BaseRepository<Nationality, Long>  {
}
