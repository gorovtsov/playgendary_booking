package test.playgendary.test.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import test.playgendary.entity.Room;
import test.playgendary.repository.RoomRepository;
import test.playgendary.service.RoomService;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RoomServiceTest extends BaseServiceTest {

    @Mock
    private RoomRepository roomRepository;

    @Autowired
    @InjectMocks
    private RoomService roomService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldReturnListOfThreeRooms() {
        Mockito.when(roomRepository.findByCapacityGreaterThan(30L))
                .thenReturn(Arrays.asList(
                        new Room(1L, "First Room", 35L),
                        new Room(2L, "Second Room", 40L),
                        new Room(3L, "Third Room", 31L)
                ));

        List<Room> rooms = roomService.findRoomBYCapacityGreaterThan(30L);

        assertThat(rooms.size(), is(3));
    }

}
