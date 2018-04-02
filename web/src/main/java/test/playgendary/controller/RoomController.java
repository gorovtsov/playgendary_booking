package test.playgendary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import test.playgendary.entity.Room;
import test.playgendary.service.RoomService;

import java.util.List;

@RestController
public class RoomController {

    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/rooms")
    public List<Room> showAllRooms() {
        return roomService.getAllRooms();
    }

    @GetMapping("/rooms/{roomId}")
    public Room showRoomsById(@PathVariable("roomId") Long roomId) {
        return roomService.getRoomById(roomId);
    }

    @PostMapping("/rooms/new")
    public Room addNewRoom(Room room) {
        return roomService.addRoom(room);
    }

}
