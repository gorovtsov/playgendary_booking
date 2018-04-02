package test.playgendary.test.entity;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.playgendary.entity.User;
import test.playgendary.repository.UserRepository;

public class UserRepositoryTest extends BaseDaoTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void saveUserTest() {
        User user = new User("tyle666", "tyler@test.by", "Tyler Hopkins", "MyPass");

        userRepository.save(user);
        System.out.println(user.getId());
    }
}
