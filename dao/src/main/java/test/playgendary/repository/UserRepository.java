package test.playgendary.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.playgendary.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByLogin(String login);
}
