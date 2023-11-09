package com.example.spring_project.services;
import com.example.spring_project.entities.Etudiant;

import java.util.List;

public interface EtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    List<Etudiant> addEtudiants (List<Etudiant> etudiants);
    Etudiant updateEtudiant (Etudiant e);
    Etudiant retrieveEtudiant(long  idEtudiant);
    void removeEtudiant(long idEtudiant);
}
