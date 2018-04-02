package test.playgendary.controller;

import org.springframework.web.bind.annotation.RestController;
import test.playgendary.service.UserService;

@RestController
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
}
