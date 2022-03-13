package com.jonareas.movies.services;

import com.jonareas.movies.entities.Language;
import com.jonareas.movies.repositories.LanguageRepository;
import org.springframework.stereotype.Service;

@Service
public class LanguageServiceImpl extends BaseServiceImpl<Language, Long, LanguageRepository> implements LanguageService
{

    LanguageServiceImpl(LanguageRepository repository) {
        super(repository);
    }
}