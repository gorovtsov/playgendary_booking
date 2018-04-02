package test.playgendary.test.entity;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.playgendary.entity.Role;
import test.playgendary.repository.RoleRepository;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;

public class RoleRepositoryTest extends BaseDaoTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void findAllRolesTest() {
        List<Role> roles = roleRepository.findAll();

        assertFalse(roles.isEmpty());
    }
}
