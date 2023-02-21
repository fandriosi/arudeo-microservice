package com.andriosi.fabio.udemy.erudio.controller;

import com.andriosi.fabio.udemy.erudio.model.Person;
import com.andriosi.fabio.udemy.erudio.services.PersonSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api-v1/person")
public class PersonController {
    @Autowired
    private PersonSevice services;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll() {
        return services.findAll();
    }
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable("id") String id) {
        return services.findById(id);
    }
    @PostMapping (consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person person) {
        return services.create(person);
    }
}
