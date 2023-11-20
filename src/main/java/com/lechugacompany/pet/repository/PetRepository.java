package com.lechugacompany.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lechugacompany.pet.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

}
