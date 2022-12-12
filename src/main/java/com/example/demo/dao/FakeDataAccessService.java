package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakeDataAccessService implements PersonDao{

    private static List<Person> persons = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        persons.add(new Person(id, person.getName()));
        return 1; //insertion always works
    }
}
