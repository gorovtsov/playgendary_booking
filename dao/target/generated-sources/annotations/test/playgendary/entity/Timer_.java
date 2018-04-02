package test.playgendary.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Timer.class)
public abstract class Timer_ {

	public static volatile SingularAttribute<Timer, LocalDateTime> start;
	public static volatile SingularAttribute<Timer, LocalDateTime> end;

}

