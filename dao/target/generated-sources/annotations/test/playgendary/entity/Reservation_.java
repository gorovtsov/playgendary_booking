package test.playgendary.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Reservation.class)
public abstract class Reservation_ extends test.playgendary.entity.BaseEntity_ {

	public static volatile SingularAttribute<Reservation, Timer> timer;
	public static volatile SingularAttribute<Reservation, String> meetingName;
	public static volatile SingularAttribute<Reservation, User> user;
	public static volatile SingularAttribute<Reservation, Long> version;
	public static volatile SingularAttribute<Reservation, Room> room;

}

