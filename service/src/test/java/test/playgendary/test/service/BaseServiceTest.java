package test.playgendary.test.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import test.playgendary.config.PersistenceConfig;
import test.playgendary.config.ServiceConfig;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ServiceConfig.class, PersistenceConfig.class})
@Transactional
public abstract class BaseServiceTest {

}
