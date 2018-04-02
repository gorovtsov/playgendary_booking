package test.playgendary.repository;

import org.springframework.data.repository.CrudRepository;
import test.playgendary.entity.Role;

import java.util.List;

public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findAll();
}
