package test.playgendary.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ extends test.playgendary.entity.BaseEntity_ {

	public static volatile SingularAttribute<User, String> password;
	public static volatile SetAttribute<User, Reservation> reservations;
	public static volatile SetAttribute<User, Role> roles;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, String> login;
	public static volatile SingularAttribute<User, String> eMail;

}

