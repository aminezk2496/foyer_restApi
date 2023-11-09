package com.example.spring_project.controllers;

import com.example.spring_project.entities.Foyer;
import com.example.spring_project.services.FoyerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoyerController {
    //low coplage
    private final FoyerService foyerService;

    public FoyerController(FoyerService foyerService) {
        this.foyerService = foyerService;
    }

    @GetMapping("/retrieveAllFoyers")
    public ResponseEntity<List<Foyer>> retrieveAllFoyers(){
        return ResponseEntity.ok(foyerService.retrieveAllFoyers());
    }

    @PostMapping("/addFoyer")
    public ResponseEntity<Foyer> addFoyer(@RequestBody Foyer foyer){
        return ResponseEntity.ok(foyerService.addFoyer(foyer));
    }

    @PatchMapping("/updateFoyer")
    public ResponseEntity<Foyer> updateFoyer(@RequestBody Foyer foyer){
        return ResponseEntity.ok(foyerService.updateFoyer(foyer));
    }

    @GetMapping("/retrieveFoyer/{id}")
    public ResponseEntity<Foyer> retrieveFoyer(@PathVariable("id") long idFoyer){
        return ResponseEntity.ok(foyerService.retrieveFoyer(idFoyer));
    }

    @DeleteMapping("removeFoyer")
    public ResponseEntity<String> removeFoyer(@RequestParam long idFoyer){
        foyerService.removeFoyer(idFoyer);
        return ResponseEntity.ok("foyer deleted successfully");
    }
}
