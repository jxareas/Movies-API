package com.jonareas.movies.controllers;

import com.jonareas.movies.entities.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;

public interface BaseController<T extends BaseEntity, ID extends Serializable> {

    public ResponseEntity<?> getAll();

    public ResponseEntity<?> save(@RequestBody T entity);

    public ResponseEntity<?> update(@PathVariable ID id, @RequestBody T entity);

    public ResponseEntity<?> delete(@PathVariable ID id);



}
