package com.example.spring_project.repositories;

import com.example.spring_project.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepo extends JpaRepository<Etudiant,Integer> {
}
