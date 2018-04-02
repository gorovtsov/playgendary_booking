package test.playgendary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import test.playgendary.dto.UserDTO;
import test.playgendary.entity.User;
import test.playgendary.service.UserService;

@Controller
public class RegistrationController {

    private UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("userData")
    public UserDTO userData() {
        return new UserDTO();
    }


    @GetMapping("/register")
    public String resisterPage() {
        return "register";
    }

    @PostMapping("/register")
    public String register(UserDTO userDTO) {
        userService.registerUser(userDTO);
        return "home";
    }
}
