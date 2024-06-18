package com.sl.phase4project.controller;


import com.sl.phase4project.model.Pet;
import com.sl.phase4project.service.PetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/pet")
public class PetController {
    @Autowired
    private PetService petService;

    @GetMapping("/home")
    @ResponseBody
    public String sayhello(){
        return "hello pets";
    }

    @GetMapping("/add")
    public ResponseEntity<String> addPet(@RequestBody Pet pet){
        petService.addPet(pet);
        return new ResponseEntity<String>("Pet Saved to db", HttpStatus.OK);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Pet>>  getAllPets(){
        List<Pet> petList = petService.getPets();
        return new ResponseEntity<>(petList, HttpStatus.OK);
    }

}
