package com.lechugacompany.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lechugacompany.pet.model.Person;
import com.lechugacompany.pet.repository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    public Person createPerson(Person newPerson) {
        personRepository.save(newPerson);
        return newPerson;
    }

    public Person getPersonById(Long id){
        return personRepository.findById(id).orElse(null);
    }

    public Person updatePerson(Long id, Person updatedPerson){
        personRepository.deleteById(id);
        personRepository.save(updatedPerson);
        return updatedPerson;
    }

    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }

}
