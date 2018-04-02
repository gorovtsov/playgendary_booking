package test.playgendary.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rooms")
@Entity
public class Room extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "capacity", insertable = false, updatable = false)
    private Long capacity;

    @OneToMany(mappedBy = "room")
    Set<Reservation> reservations = new HashSet<>();

    public Room(long id, String name, long capacity) {
        super(id);
        this.name = name;
        this.capacity = capacity;
    }
}
