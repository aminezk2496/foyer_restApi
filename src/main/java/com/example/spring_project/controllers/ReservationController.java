package com.example.spring_project.controllers;
import com.example.spring_project.entities.Reservation;
import com.example.spring_project.services.ReservationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ReservationController {
    //low coplage
    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }


    @GetMapping("/retrieveAllReservation")
    public ResponseEntity<List<Reservation>> retrieveAllReservation(){
        return ResponseEntity.ok(reservationService.retrieveAllReservation());
    }



    @PatchMapping("/updateReservation")
    public ResponseEntity<Reservation> updateReservation(@RequestBody Reservation res){
        return ResponseEntity.ok(reservationService.updateReservation(res));
    }

    @GetMapping("/retrieveReservation/{id}")
    public ResponseEntity<Reservation> retrieveReservation(@PathVariable("id") long idReservation){
        return ResponseEntity.ok(reservationService.retrieveReservation(idReservation));
    }







}
