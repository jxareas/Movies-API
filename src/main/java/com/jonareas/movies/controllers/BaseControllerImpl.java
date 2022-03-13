package com.jonareas.movies.controllers;


import com.jonareas.movies.entities.BaseEntity;
import com.jonareas.movies.services.BaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

public abstract class BaseControllerImpl<T extends BaseEntity, ID extends Serializable, S extends BaseService<T, ID>>
        implements BaseController<T, ID> {

    protected S service;

    BaseControllerImpl(S service) {
        this.service = service;
    }


    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intentelo luego.\"}");
        }
    }


    @PostMapping(path = "")
    public ResponseEntity<?> save(@RequestBody T entity) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intentelo luego.\"}");
        }
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<?> update(@PathVariable ID id, @RequestBody T entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.update(id, entity));
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intentelo luego.\"}");
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable ID id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(service.delete(id));
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intentelo luego.\"}");
        }
    }
}
