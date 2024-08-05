package com.crud.controllers;

import com.crud.dtos.ReservationMapper;
import com.crud.dtos.ReservationRegistrationDTO;
import com.crud.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @Autowired
    private ReservationMapper reservationMapper;

    @GetMapping
    public List<ReservationRegistrationDTO> getAllReservations() {
        return reservationService.getAllReservations().stream()
                .map(reservationMapper::toDto)
                .collect(Collectors.toList());
    }
}
