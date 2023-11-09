package com.example.spring_project.services;
import java.util.List;

import com.example.spring_project.entities.Bloc;
import com.example.spring_project.entities.Chambre;
import com.example.spring_project.repositories.ChambreRepo;
import org.springframework.stereotype.Service;
import com.example.spring_project.entities.Reservation;
import com.example.spring_project.repositories.ReservationRepo;

@Service

public class ReservationServiceImp implements ReservationService {
    private final ReservationRepo reservationRepo;
    private final ChambreRepo chambreRepo;

    // same as @RequiredArgsConstructorReservation
    public ReservationServiceImp(ReservationRepo reservationRepo, ChambreRepo chambreRepo) {
        this.reservationRepo = reservationRepo;
        this.chambreRepo = chambreRepo;
    }

    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepo.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepo.save(res);
    }

    @Override
    public Reservation retrieveReservation(long idReservation) {
        return reservationRepo.findById((int)idReservation).get();
    }
}