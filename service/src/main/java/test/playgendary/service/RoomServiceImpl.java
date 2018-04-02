package test.playgendary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.playgendary.entity.Room;
import test.playgendary.repository.RoomRepository;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private RoomRepository roomRepository;

    @Autowired
    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> getAllRooms() {
        return (List<Room>) roomRepository.findAll();
    }

    @Override
    public Room getRoomById(Long roomId) {
        return roomRepository.findOne(roomId);
    }

    @Override
    public Room addRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public List<Room> findRoomBYCapacityGreaterThan(Long minimalCapacity) {

        return roomRepository.findByCapacityGreaterThan(minimalCapacity);
    }
}
