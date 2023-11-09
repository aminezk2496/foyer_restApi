package com.example.spring_project.services;
import com.example.spring_project.entities.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> retrieveAllReservation();
    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (long idReservation);
}
