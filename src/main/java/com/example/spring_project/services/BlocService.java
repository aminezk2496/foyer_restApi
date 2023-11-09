package com.example.spring_project.services;

import com.example.spring_project.entities.Bloc;
import com.example.spring_project.entities.Foyer;

import java.util.List;

public interface BlocService {
    List<Bloc> retrieveBlocs();
    Bloc updateBloc (Bloc bloc);
    Bloc addBloc (Bloc bloc);
    Bloc retrieveBloc (long idBloc);
    void removeBloc (long idBloc);
    List<Bloc> getAllBlocByFoyer(Foyer foyer);
}
