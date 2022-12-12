package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonDao {
    //insert person with id
    //returns 0 or 1 depending on whether
    int insertPerson(UUID id, Person person);

    //insert person without id (id randomly generated)
    default int addPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
