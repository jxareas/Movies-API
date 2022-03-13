package com.jonareas.movies.controllers;

import com.jonareas.movies.entities.Nationality;
import com.jonareas.movies.services.NationalityServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/nationalities")
public class NationalityController extends BaseControllerImpl<Nationality, Long, NationalityServiceImpl> {

    NationalityController(NationalityServiceImpl service) {
        super(service);
    }

}
