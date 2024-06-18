package com.sl.phase4project.service;


import com.sl.phase4project.model.Pet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PetService {

    Pet addPet(Pet pet);

    List<Pet> getPets();
}
