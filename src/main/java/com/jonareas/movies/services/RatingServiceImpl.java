package com.jonareas.movies.services;

import com.jonareas.movies.entities.Rating;
import com.jonareas.movies.repositories.RatingRepository;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceImpl extends BaseServiceImpl<Rating, Long, RatingRepository> implements RatingService
{

    RatingServiceImpl(RatingRepository repository) {
        super(repository);
    }

}