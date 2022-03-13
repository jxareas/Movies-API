package com.jonareas.movies.controllers;

import com.jonareas.movies.entities.Movie;
import com.jonareas.movies.services.MovieServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/movies")
public class MovieController extends BaseControllerImpl<Movie, Long, MovieServiceImpl> {

    MovieController(MovieServiceImpl service) { super(service); }

}
