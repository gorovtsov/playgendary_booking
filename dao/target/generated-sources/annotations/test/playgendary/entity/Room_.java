package test.playgendary.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Room.class)
public abstract class Room_ extends test.playgendary.entity.BaseEntity_ {

	public static volatile SetAttribute<Room, Reservation> reservations;
	public static volatile SingularAttribute<Room, String> name;
	public static volatile SingularAttribute<Room, Long> capacity;

}

