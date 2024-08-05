package com.crud.dtos;

import com.crud.model.Reservation;

public class ReservationMapper {

    public ReservationRegistrationDTO toDto(Reservation reservation) {
        ReservationRegistrationDTO dto = new ReservationRegistrationDTO();
        dto.setId(reservation.getId());
        dto.setRoomName(reservation.getRoomName());
        dto.setStartTime(reservation.getStartTime());
        dto.setEndTime(reservation.getEndTime());
        dto.setReservedBy(reservation.getReservedBy());
        return dto;
    }

    public Reservation toEntity(ReservationRegistrationDTO dto) {
        Reservation reservation = new Reservation();
        reservation.setId(dto.getId());
        reservation.setRoomName(dto.getRoomName());
        reservation.setStartTime(dto.getStartTime());
        reservation.setEndTime(dto.getEndTime());
        reservation.setReservedBy(dto.getReservedBy());
        return reservation;
    }
}
