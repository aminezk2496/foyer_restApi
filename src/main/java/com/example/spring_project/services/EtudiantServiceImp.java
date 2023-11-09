package com.example.spring_project.services;
import java.util.List;

import com.example.spring_project.entities.Foyer;
import com.example.spring_project.repositories.FoyerRepo;
import org.springframework.stereotype.Service;
import com.example.spring_project.entities.Etudiant;
import com.example.spring_project.repositories.EtudiantRepo;

@Service

public class EtudiantServiceImp implements EtudiantService {
    private final EtudiantRepo etudiantRepo;
    // same as @RequiredArgsConstructor
    public EtudiantServiceImp(EtudiantRepo etudiantRepo) {
        this.etudiantRepo = etudiantRepo;
    }


    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepo.findAll();
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return etudiantRepo.saveAll(etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepo.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return etudiantRepo.findById((int)idEtudiant).get();
    };


    @Override
    public void removeEtudiant(long idEtudiant) {
        etudiantRepo.deleteById((int)idEtudiant);
    }
}
