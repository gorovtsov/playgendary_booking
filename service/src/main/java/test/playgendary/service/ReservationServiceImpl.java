package test.playgendary.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import test.playgendary.dto.DateFilterDTO;
import test.playgendary.entity.Reservation;
import test.playgendary.entity.Room;
import test.playgendary.entity.Timer;
import test.playgendary.exception.IllegalTimeException;
import test.playgendary.exception.RoomIsNotFreeException;
import test.playgendary.repository.ReservationRepository;
import test.playgendary.repository.RoomRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

@Service
@PropertySource("classpath:company_rules.properties")
public class ReservationServiceImpl implements ReservationService {

    private LocalTime workdayStart;
    private LocalTime workdayEnd;

    private ReservationRepository reservationRepository;
    private RoomRepository roomRepository;
    private TimerService timerService;

    public ReservationServiceImpl(ReservationRepository reservationRepository,
                                  RoomRepository roomRepository,
                                  TimerService timerService) {
        this.reservationRepository = reservationRepository;
        this.timerService = timerService;
        this.roomRepository = roomRepository;

        this.workdayStart = LocalTime.of(8, 0);
        this.workdayEnd = LocalTime.of(19, 0);

        System.out.println(workdayStart + " " + workdayEnd);
    }


    @Override
    public List<Reservation> getReservationsByLogin(String login) {
        return reservationRepository.findByUserLogin(login);
    }

    @Override
    public List<Reservation> getReservationsByDates(DateFilterDTO filterDTO) {
        LocalDate start = filterDTO.getStart();
        LocalDate end = filterDTO.getEnd();

        return null;
    }

    @Override
    public Reservation reserveRoom(Reservation reservation) throws RoomIsNotFreeException, IllegalTimeException {

        Room room = reservation.getRoom();
        Timer timerToReserve = reservation.getTimer();
        Set<Reservation> currentReservations = room.getReservations();

        if (!timerService.isFree(timerToReserve, currentReservations)) {
            throw new RoomIsNotFreeException("Sorry, room is reserved for this time");
        }

        if (!isInWorkTime(reservation)) {
            throw new IllegalTimeException("Sorry, reserve room in work time");
        }

        saveReservation(reservation);

        return reservation;
    }

    private void saveReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    private boolean isInWorkTime(Reservation reservation) {

        Timer timer = reservation.getTimer();

        return timer.getStart().getHour() > workdayStart.getHour() && timer.getEnd().getHour() < workdayEnd.getHour();
    }
}
