package test.playgendary.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import test.playgendary.enumeration.RoleName;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "roles")
@Entity
public class Role extends BaseEntity {

    @Column(name = "role_name", nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleName roleName;
}
