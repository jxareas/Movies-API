package com.jonareas.movies.repositories;

import com.jonareas.movies.entities.Language;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends BaseRepository<Language, Long>  {
}
