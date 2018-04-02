package test.playgendary.test.service;

import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import test.playgendary.dto.UserDTO;
import test.playgendary.entity.User;
import test.playgendary.service.UserService;

import static org.junit.Assert.assertTrue;

public class UserServiceTest extends BaseServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void registerUserTest() {
        UserDTO userDTO = new UserDTO();

        userDTO.setLogin("tryhard");
        userDTO.setPassword("testpass");
        userDTO.setName("Valentin Karpov");
        userDTO.setEMail("test@mail.mail");

        User user = userService.registerUser(userDTO);

        System.out.println(user.getId());
        assertTrue(user.getId() > 0);
    }
}
