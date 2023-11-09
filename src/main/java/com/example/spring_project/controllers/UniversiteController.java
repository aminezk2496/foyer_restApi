package com.example.spring_project.controllers;
import com.example.spring_project.entities.Universite;
import com.example.spring_project.services.UniversiteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UniversiteController {
    //low coplage
    private final UniversiteService universiteService;

    public UniversiteController(UniversiteService universiteService) {this.universiteService = universiteService;}

    @GetMapping("/retrieveAllUniversities")
    public ResponseEntity<List<Universite>> retrieveAllUniversities(){
        return ResponseEntity.ok(universiteService.retrieveAllUniversities());
    }

    @PostMapping("/addUniversity")
    public ResponseEntity<Universite> addUniversity(@RequestBody Universite u){
        return ResponseEntity.ok((Universite) universiteService.addUniversity(u));
    }

    @PatchMapping("/updateUniversity")
    public ResponseEntity<Universite> updateUniversity(@RequestBody Universite u){
        return ResponseEntity.ok(universiteService.updateUniversity(u));
    }

    @GetMapping("/retrieveUniversity/{id}")
    public ResponseEntity<Universite> retrieveUniversity(@PathVariable("id") long idUniversity){
        return ResponseEntity.ok(universiteService.retrieveUniversity(idUniversity));
    }



    }

