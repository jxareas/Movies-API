package com.jonareas.movies.controllers;

import com.jonareas.movies.entities.Genre;
import com.jonareas.movies.services.GenreServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/genres")
public class GenreController  extends BaseControllerImpl<Genre, Long, GenreServiceImpl> {


    GenreController(GenreServiceImpl service) {
        super(service);
    }
}
