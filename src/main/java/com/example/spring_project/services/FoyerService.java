package com.example.spring_project.services;

import com.example.spring_project.entities.Foyer;

import java.util.List;

public interface FoyerService {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer (Foyer f);

    Foyer updateFoyer (Foyer f);

    Foyer retrieveFoyer (long idFoyer);

    void removeFoyer (long idFoyer);
}
