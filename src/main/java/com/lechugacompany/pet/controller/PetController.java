package com.lechugacompany.pet.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lechugacompany.pet.model.Pet;
import com.lechugacompany.pet.model.PetRequest;
import com.lechugacompany.pet.service.PetService;

@RestController
@RequestMapping("api/pet")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("")
    public List<Pet> getListPets(){
        return petService.getListPets();
    }
    
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public ResponseEntity<Pet> createPet(@RequestBody PetRequest petRequest){
        return ResponseEntity.ok(petService.createPet(petRequest.getName(), petRequest.getType(), petRequest.getOwnerId()));
    }

    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable Long id){
        petService.deletePet(id);
    }

    @GetMapping("/{id}")
    public Pet getPet(@PathVariable Long id){
        return petService.getPet(id);
    }

}
