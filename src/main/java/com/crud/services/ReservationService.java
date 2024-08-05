package com.crud.services;

import com.crud.model.Reservation;
import com.crud.repositories.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    public final ReservationRepository reservationRepository;


    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Optional<Reservation> getReservationById(Long id) {
        return  reservationRepository.findById(id);
    }

    public Reservation createReservation (Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Reservation updateReservation (Long id, Reservation reservation) {
        if(reservationRepository.existsById(id)) {
            reservation.setId(id);
            return  reservationRepository.save(reservation);
        }
        return null;
    }

    public void deleteReservation (Long id) {
        reservationRepository.deleteById(id);
    }
}
