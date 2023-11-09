package com.example.spring_project.controllers;
import com.example.spring_project.entities.Bloc;
import com.example.spring_project.entities.Foyer;
import com.example.spring_project.services.BlocService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlocController {
    //low coplage
    private final BlocService blocService;

    public BlocController(BlocService blocService) {
        this.blocService = blocService;
    }

    @GetMapping("/retrieveBlocs")
    public ResponseEntity<List<Bloc>> retrieveBlocs(){
        return ResponseEntity.ok(blocService.retrieveBlocs());
    }

    @PostMapping("/addBloc")
    public ResponseEntity<Bloc> addBloc(@RequestBody Bloc bloc){
        return ResponseEntity.ok((Bloc) blocService.addBloc(bloc));
    }

    @PatchMapping("/updateBloc")
    public ResponseEntity<Bloc> updateBloc(@RequestBody Bloc bloc){
        return ResponseEntity.ok(blocService.updateBloc(bloc));
    }

    @GetMapping("/retrieveBloc/{id}")
    public ResponseEntity<Bloc> retrieveBloc(@PathVariable("id") long idBloc){
        return ResponseEntity.ok(blocService.retrieveBloc(idBloc));
    }

    @DeleteMapping("removeBloc")
    public ResponseEntity<String> removeBloc(@RequestParam long idBloc){
        blocService.removeBloc(idBloc);
        return ResponseEntity.ok("bloc deleted successfully");
    }

    @GetMapping("/c")
    public ResponseEntity<List> getAllBlocByFoyer(@RequestBody Foyer foyer){
        return ResponseEntity.ok(blocService.getAllBlocByFoyer(foyer));
    }

}
