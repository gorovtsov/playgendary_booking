package test.playgendary.test.entity;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.playgendary.repository.RoomRepository;

public class RoomRepositoryTest extends BaseDaoTest {

    @Autowired
    RoomRepository roomRepository;

    @Test
    public void findRoomGreaterThan() {
        roomRepository.findByCapacityGreaterThan(14L).forEach(room -> System.out.println(room.getName()));
    }
}
