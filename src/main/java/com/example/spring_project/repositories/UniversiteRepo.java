package com.example.spring_project.repositories;

import com.example.spring_project.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepo  extends JpaRepository<Universite,Integer> {
}
