package spring.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.test.Beans;
import spring.test.DesktopConfiguration;
import spring.test.bean.definition.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Beans.class)
public class InjectionTest {
	
	private Logger LOG = Logger.getLogger(InjectionTest.class);
	
	@Autowired
	private Users users;
	
	@Autowired
	public DesktopConfiguration desktopConfiguration; 

	@Test
	public void injectionFromBeanDefinedInClass() {
		LOG.info(users);
	}
	
	@Test
	public void componentInjection() {
		LOG.info(desktopConfiguration);
	}
}
