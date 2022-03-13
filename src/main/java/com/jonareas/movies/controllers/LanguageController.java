package com.jonareas.movies.controllers;

import com.jonareas.movies.entities.Language;
import com.jonareas.movies.services.LanguageServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/languages")
public class LanguageController extends BaseControllerImpl<Language, Long, LanguageServiceImpl> {


    LanguageController(LanguageServiceImpl service) {
        super(service);
    }
}
