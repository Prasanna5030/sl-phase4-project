package com.sl.phase4project.service;


import com.sl.phase4project.model.Pet;
import com.sl.phase4project.repository.PetRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;

    public Pet addPet(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public List<Pet> getPets() {
        return petRepository.findAll();
    }


}
