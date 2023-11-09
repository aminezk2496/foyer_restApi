package com.example.spring_project.services;
import java.util.List;

import com.example.spring_project.entities.Foyer;
import com.example.spring_project.repositories.EtudiantRepo;
import org.springframework.stereotype.Service;
import com.example.spring_project.entities.Bloc;
import com.example.spring_project.repositories.BlocRepo;

@Service

public class BlocServiceImp implements BlocService {
    private final BlocRepo blocRepo;
    // same as @RequiredArgsConstructor
    public BlocServiceImp(BlocRepo blocRepo) {
        this.blocRepo = blocRepo;
    }


    @Override
    public List<Bloc> retrieveBlocs() {
        return blocRepo.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepo.findById((int)idBloc).get();
    }

    @Override
    public void removeBloc(long idBloc)  {blocRepo.deleteById((int)idBloc);
    }

    @Override
    public List<Bloc> getAllBlocByFoyer(Foyer foyer) {
        return blocRepo.findAllByFoyerBloc(foyer);
    }
}
