package test.playgendary.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Timer {

    private LocalDateTime start;
    private LocalDateTime end;

    public boolean containsMoment(LocalDateTime time) {

        return time.isAfter(start) && time.isBefore(end);
    }
}
