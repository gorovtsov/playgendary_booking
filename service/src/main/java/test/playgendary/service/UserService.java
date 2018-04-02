package test.playgendary.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import test.playgendary.dto.UserDTO;
import test.playgendary.entity.User;

public interface UserService extends UserDetailsService {

    User registerUser(UserDTO userDTO);
}
