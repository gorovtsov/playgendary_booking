package test.playgendary.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.playgendary.entity.Reservation;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Reservation findByMeetingName(String name);

    List<Reservation> findByUserLogin(String login);

    List<Reservation> findByTimerStartGreaterThanEqualAndTimerEndLessThanEqual(LocalDateTime start, LocalDateTime end);
}
