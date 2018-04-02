package test.playgendary.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "reservations")
@NoArgsConstructor
public class Reservation extends BaseEntity {

    @Column(name = "meeting_name", nullable = false)
    private String meetingName;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @AttributeOverrides(value = {
            @AttributeOverride(name = "start", column = @Column(name = "start_time", nullable = false)),
            @AttributeOverride(name = "end", column = @Column(name = "end_time", nullable = false))
    })
    private Timer timer;

    @Version
    @Column(name = "version")
    private Long version;
}
