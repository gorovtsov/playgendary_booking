package test.playgendary.service;

import org.springframework.stereotype.Service;
import test.playgendary.dto.DateFilterDTO;
import test.playgendary.entity.Reservation;
import test.playgendary.exception.IllegalTimeException;
import test.playgendary.exception.RoomIsNotFreeException;

import java.time.LocalTime;
import java.util.List;

@Service
public interface ReservationService {
    List<Reservation> getReservationsByLogin(String login);

    Reservation reserveRoom(Reservation reservation) throws RoomIsNotFreeException, IllegalTimeException;

    List<Reservation> getReservationsByDates(DateFilterDTO filterDTO);
}
