package com.lechugacompany.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lechugacompany.pet.model.Person;

public interface PersonRepository extends JpaRepository <Person, Long> {
    
}
