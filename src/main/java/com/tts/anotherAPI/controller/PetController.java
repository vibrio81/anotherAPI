package com.tts.anotherAPI.controller;

import com.tts.anotherAPI.model.Pet;

import com.tts.anotherAPI.repo.PetRepository;
import com.tts.anotherAPI.service.PetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/")
@RestController

public class PetController {

    @Autowired
    PetRepository petRepository;

    PetService petService;

    public PetController (PetService petService) {
        this.petService = petService;
    }

    @GetMapping("pet/{id}")
    public Optional<Pet> getPetById(@PathVariable Long id){
        return petService.getPet(id);
    }
    @GetMapping("all")
    public Iterable<Pet> getAllPets(){
        return petService.getAllPets();
    }

    @PostMapping("new")
    public void addNewPet(@RequestBody Pet pet){
        petRepository.save(pet);
    }
    @DeleteMapping("pet/{id}")
    public void deletePet (@PathVariable Long id){
        petRepository.deleteById(id);
    }
}
