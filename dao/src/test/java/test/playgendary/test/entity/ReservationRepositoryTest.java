package test.playgendary.test.entity;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import test.playgendary.entity.Reservation;
import test.playgendary.entity.Room;
import test.playgendary.entity.Timer;
import test.playgendary.entity.User;
import test.playgendary.repository.ReservationRepository;
import test.playgendary.repository.RoomRepository;
import test.playgendary.repository.UserRepository;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class ReservationRepositoryTest extends BaseDaoTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    ReservationRepository reservationRepository;

    @Test
    public void reserveRoomTest() {
        User user = userRepository.findByLogin("jumbo");
        Room room = roomRepository.findOne(1L);
        Reservation reservation = new Reservation();

        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusMinutes(30);
        Timer timer = new Timer(start, end);

        reservation.setUser(user);
        reservation.setMeetingName("Test Meeting");
        reservation.setRoom(room);
        reservation.setTimer(timer);

        reservationRepository.save(reservation);

        assertTrue(reservation.getId() > 0);
    }

    @Test
    public void findByUserLoginTest() {
        List<Reservation> reservations = reservationRepository.findByUserLogin("jumbo");
        assertFalse(reservations.isEmpty());
    }

    @Test
    public void findBetweenTimes() {
        LocalDateTime startTime = LocalDateTime.of(2018, Month.MARCH, 23, 10, 10);
        LocalDateTime endTime = startTime.plusDays(10);

        List<Reservation> result =
                reservationRepository.findByTimerStartGreaterThanEqualAndTimerEndLessThanEqual(startTime, endTime);
        assertFalse(result.isEmpty());
    }
}
