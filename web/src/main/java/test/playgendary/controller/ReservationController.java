package test.playgendary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.playgendary.dto.DateFilterDTO;
import test.playgendary.entity.Reservation;
import test.playgendary.entity.Timer;
import test.playgendary.exception.IllegalTimeException;
import test.playgendary.exception.RoomIsNotFreeException;
import test.playgendary.service.ReservationService;

import java.time.LocalDate;
import java.util.List;

@RestController
public class ReservationController {

    private ReservationService reservationService;

    @ModelAttribute("checkingTimer")
    public Timer checkingTimer() {
        return new Timer();
    }

    @ModelAttribute("reservation")
    public Reservation reservation() {
        return new Reservation();
    }

    @ModelAttribute("reservationDateFilter")
    public DateFilterDTO reservationDateFilter() {
        return new DateFilterDTO();
    }

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/reservation/new")
    public Reservation reserveRoom(Reservation reservation) throws RoomIsNotFreeException, IllegalTimeException {
        return reservationService.reserveRoom(reservation);
    }

    @PostMapping("/reservation/timed")
    public List<Reservation> showReservationsByTime(DateFilterDTO dateFilterDTO) {
        return reservationService.getReservationsByDates(dateFilterDTO);
    }


    @ExceptionHandler(RoomIsNotFreeException.class)
    public String roomIsNotFree() {
        return "error";
    }

    @ExceptionHandler()
    public String notInWorkTime() {
        return "error";
    }


}
