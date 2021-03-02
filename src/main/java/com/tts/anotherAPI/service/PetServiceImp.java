package com.tts.anotherAPI.service;


import com.tts.anotherAPI.model.Pet;
import com.tts.anotherAPI.repo.PetRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PetServiceImp implements PetService{
    PetRepository petRepository;

    public PetServiceImp(PetRepository petRepository){
        this.petRepository=petRepository;
    }
    @Override
    public Optional<Pet> getPet(Long id){
        return petRepository.findById(id);
    }
    @Override
    public Iterable<Pet> getAllPets(){
        return petRepository.findAll();
    }
}
