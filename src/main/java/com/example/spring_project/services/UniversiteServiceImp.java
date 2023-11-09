package com.example.spring_project.services;
import java.util.List;

import com.example.spring_project.repositories.BlocRepo;
import org.springframework.stereotype.Service;
import com.example.spring_project.entities.Universite;
import com.example.spring_project.repositories.UniversiteRepo;

@Service
public class UniversiteServiceImp implements UniversiteService {
    private final UniversiteRepo universiteRepo;
    // same as @RequiredArgsConstructor
    public UniversiteServiceImp(UniversiteRepo universiteRepo) {
        this.universiteRepo = universiteRepo;}


    @Override
    public List<Universite> retrieveAllUniversities() {
        return universiteRepo.findAll();
    }

    @Override
    public Universite addUniversity(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite retrieveUniversity(long idUniversity)  {
        return universiteRepo.findById((int)idUniversity).get();
    }
}



