package com.example.spring_project.repositories;

import com.example.spring_project.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo  extends JpaRepository<Reservation,Integer> {
}