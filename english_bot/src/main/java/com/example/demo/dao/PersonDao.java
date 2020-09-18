package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class PersonDao implements Dao {
    @Autowired
    private EntityManager entityManager;
    @Override
    public void savePerson(Person person) {
        entityManager.persist(person);

    }
}
