package com.example.spring_project.controllers;

import com.example.spring_project.entities.Etudiant;
import com.example.spring_project.services.EtudiantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EtudiantController {
    //low coplage
    private final  EtudiantService  etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @GetMapping("/retrieveAllEtudiants")
    public ResponseEntity<List<Etudiant>> retrieveAllEtudiants(){
        return ResponseEntity.ok(etudiantService.retrieveAllEtudiants());
    }

    @PostMapping("/addEtudiants")
    public ResponseEntity<Etudiant> addEtudiants(@RequestBody Etudiant etudiant){
        return ResponseEntity.ok((Etudiant) etudiantService.addEtudiants((List<Etudiant>) etudiant));
    }

    @PatchMapping("/updateEtudiant")
    public ResponseEntity<Etudiant> updateEtudiant(@RequestBody Etudiant etudiant){
        return ResponseEntity.ok(etudiantService.updateEtudiant(etudiant));
    }

    @GetMapping("/retrieveEtudiant/{id}")
    public ResponseEntity<Etudiant> retrieveEtudiant(@PathVariable("id") long idEtudiant){
        return ResponseEntity.ok(etudiantService.retrieveEtudiant(idEtudiant));
    }

    @DeleteMapping("removeEtudiant")
    public ResponseEntity<String> removeEtudiant(@RequestParam long idEtudiant){
        etudiantService.removeEtudiant(idEtudiant);
        return ResponseEntity.ok("etudiant deleted successfully");
    }
}