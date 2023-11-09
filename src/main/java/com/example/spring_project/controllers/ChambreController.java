package com.example.spring_project.controllers;
import com.example.spring_project.entities.Chambre;
import com.example.spring_project.services.ChambreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class ChambreController {
    //low coplage
    private final ChambreService chambreService;

    public ChambreController(ChambreService chambreService) {
        this.chambreService = chambreService;
    }

    @GetMapping("/retrieveAllChambres")
    public ResponseEntity<List<Chambre>> retrieveAllChambres(){
        return ResponseEntity.ok(chambreService.retrieveAllChambres());
    }

    @PostMapping("/addChambre")
    public ResponseEntity<Chambre> addChambre(@RequestBody Chambre c){
        return ResponseEntity.ok((Chambre) chambreService.addChambre(c));
    }

    @PatchMapping("/updateChambre")
    public ResponseEntity<Chambre> updateChambre(@RequestBody Chambre c){
        return ResponseEntity.ok(chambreService.updateChambre(c));
    }

    @GetMapping("/retrieveChambre/{id}")
    public ResponseEntity<Chambre> retrieveChambre(@PathVariable("id") long idChambre){
        return ResponseEntity.ok(chambreService.retrieveChambre(idChambre));
    }






}
