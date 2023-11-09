package com.example.spring_project.services;


import com.example.spring_project.entities.Foyer;
import com.example.spring_project.repositories.FoyerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class FoyerServiceImp implements FoyerService {


    private final FoyerRepo foyerRepo;
// same as @RequiredArgsConstructor
    public FoyerServiceImp(FoyerRepo foyerRepo) {
        this.foyerRepo = foyerRepo;
    }


    @Override

    public List<Foyer> retrieveAllFoyers() {
        return foyerRepo.findAll();
    }


    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepo.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepo.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepo.findById((int)idFoyer).get();
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepo.deleteById((int)idFoyer);
    }
}
