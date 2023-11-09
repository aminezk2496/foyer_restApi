package com.example.spring_project.repositories;

import com.example.spring_project.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepo  extends JpaRepository<Chambre,Integer> {
}
