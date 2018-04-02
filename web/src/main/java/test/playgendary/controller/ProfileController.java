package test.playgendary.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.playgendary.entity.Reservation;
import test.playgendary.service.ReservationService;
import test.playgendary.service.UserService;

import java.util.List;

@RestController
public class ProfileController {

    private UserService userService;
    private ReservationService reservationService;

    public ProfileController(UserService userService, ReservationService reservationService) {
        this.userService = userService;
        this.reservationService = reservationService;
    }

    @GetMapping("/profile/myReservations")
    public List<Reservation> getMyReservations() {
        String login = SecurityContextHolder.getContext().getAuthentication().getName();

        return reservationService.getReservationsByLogin(login);
    }

}
