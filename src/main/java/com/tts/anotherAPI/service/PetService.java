package com.tts.anotherAPI.service;

import com.tts.anotherAPI.model.Pet;


import java.util.Optional;

public interface PetService {
    Optional<Pet> getPet(Long id);
    Iterable<Pet>getAllPets();
}
