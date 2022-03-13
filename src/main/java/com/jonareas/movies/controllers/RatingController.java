package com.jonareas.movies.controllers;

import com.jonareas.movies.entities.Rating;
import com.jonareas.movies.services.RatingServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/ratings")
public class RatingController extends BaseControllerImpl<Rating, Long, RatingServiceImpl> {


    RatingController(RatingServiceImpl service) {
        super(service);
    }
}
