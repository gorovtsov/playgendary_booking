package test.playgendary.service;

import test.playgendary.entity.Reservation;
import test.playgendary.entity.Timer;

import java.util.Set;

public interface TimerService {
    boolean isFree(Timer timerToCheck, Set<Reservation> reservations);
}
