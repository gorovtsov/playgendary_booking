package test.playgendary.service;


import test.playgendary.entity.Room;

import java.util.List;

public interface RoomService {
    List<Room> getAllRooms();

    Room getRoomById(Long roomId);

    Room addRoom(Room room);

    List<Room> findRoomBYCapacityGreaterThan(Long minimalCapacity);
}
