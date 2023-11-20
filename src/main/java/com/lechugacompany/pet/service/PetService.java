package com.lechugacompany.pet.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lechugacompany.pet.model.Person;
import com.lechugacompany.pet.model.Pet;
import com.lechugacompany.pet.repository.PersonRepository;
import com.lechugacompany.pet.repository.PetRepository;

@Service
public class PetService {
    
    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PersonRepository personRepository;

    public List<Pet> getListPets(){
        List<Pet> listPets = petRepository.findAll();
        return listPets.isEmpty() ? null: listPets;
    }

    public Pet createPet(String name, String type, Long personId){
        Person person = personRepository.findById(personId).orElse(null);
        Pet newPet = new Pet(name, type, person);
        petRepository.save(newPet);
        return newPet;
    }

    public void deletePet(Long id){
        petRepository.deleteById(id);
    }

    public Pet getPet(Long id){
        return petRepository.findById(id).orElse(null);
    }
}
