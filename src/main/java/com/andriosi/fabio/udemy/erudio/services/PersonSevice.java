package com.andriosi.fabio.udemy.erudio.services;

import com.andriosi.fabio.udemy.erudio.model.Person;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonSevice {
    private final AtomicLong counter = new AtomicLong();

    public Person findById(String id){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Fabio Luis");
        person.setLastName("Andriosi");
        person.setAddress("Av.: Das Amoreiras, 23, Sao Bernardo, Campinas Sao Paulo");
        person.setGender("Male");
        return  person;
    }
    public List<Person> findAll(){
        List<Person> persons = new ArrayList<>();
        for (int i =0; i<8 ; i++){
            persons.add(mockPerson(i));
        }
        return persons;
    }

    private Person mockPerson(int i){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("First Name "+i);
        person.setLastName("Last Name "+i);
        person.setAddress("Endereço no Brasil "+i);
        person.setGender("Male");
        return person;
    }

    public Person create(Person person){
        return person;
    }
}
