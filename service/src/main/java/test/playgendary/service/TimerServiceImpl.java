package test.playgendary.service;

import org.springframework.stereotype.Service;
import test.playgendary.entity.Reservation;
import test.playgendary.entity.Timer;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TimerServiceImpl implements TimerService {

    @Override
    public boolean isFree(Timer targetTimer, Set<Reservation> reservations) {

        List<Boolean> result = reservations.stream()
                .map(Reservation::getTimer)
                .map(timer -> isFreeOne(targetTimer, timer))
                .collect(Collectors.toList());

        return result.contains(true);
    }

    private boolean isFreeOne(Timer targetTimer, Timer existingTimer) {

        LocalDateTime targetTimerStart = targetTimer.getStart();
        LocalDateTime targetTimerEnd = targetTimer.getEnd();

        if (existingTimer.containsMoment(targetTimerStart) && existingTimer.containsMoment(targetTimerEnd)) {
            return false;
        } else {
            return true;
        }
    }
}
