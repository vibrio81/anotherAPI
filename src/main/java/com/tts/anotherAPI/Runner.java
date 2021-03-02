package com.tts.anotherAPI;

import com.tts.anotherAPI.model.Pet;
import com.tts.anotherAPI.repo.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    PetRepository petRepository;

    @Override
    public void run(String...args) throws Exception{
        petRepository.save(new Pet( "Dog", "Maple"));
        petRepository.save(new Pet("Dog", "Daisy"));
        petRepository.save(new Pet("Dog", "Clementine"));
        petRepository.save(new Pet("Cat", "Neko"));
        petRepository.save(new Pet("Cat", "Boot"));
        petRepository.save(new Pet("Turtle", "Fernando"));

    }
}
