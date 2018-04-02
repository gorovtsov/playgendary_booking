package test.playgendary.test.entity;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import test.playgendary.config.PersistenceConfig;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = PersistenceConfig.class)
@Transactional
public abstract class BaseDaoTest {
}
