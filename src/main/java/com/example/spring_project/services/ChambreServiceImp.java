package com.example.spring_project.services;
import java.util.List;

import com.example.spring_project.repositories.UniversiteRepo;
import org.springframework.stereotype.Service;
import com.example.spring_project.entities.Chambre;
import com.example.spring_project.repositories.ChambreRepo;

@Service

public class ChambreServiceImp implements ChambreService {
    private final ChambreRepo chambreRepo;
    // same as @RequiredArgsConstructor
    public ChambreServiceImp(ChambreRepo chambreRepo) {
        this.chambreRepo = chambreRepo;}


    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepo.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepo.findById((int)idChambre).get();
    }
}



