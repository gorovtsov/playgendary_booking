package test.playgendary.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.playgendary.entity.Room;

import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

    List<Room> findByCapacityLessThan(Long maxCapacity);

    List<Room> findByCapacityGreaterThan(Long minCapacity);
}
