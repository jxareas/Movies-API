package com.jonareas.movies.repositories;

import com.jonareas.movies.entities.Rating;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends BaseRepository<Rating, Long>  {

}
