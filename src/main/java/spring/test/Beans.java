package spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.test.bean.definition.Users;
import spring.test.model.User;

@Configuration
@ComponentScan(basePackages="spring.test*")
public class Beans {

	@Bean
	public Users users() {
		Users users = new Users();
		users.addUser(new User("Developer"), new User("Tester"));
		return users;
	}
}
