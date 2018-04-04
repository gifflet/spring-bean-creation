package spring.test.bean.definition;

import java.util.Collection;
import java.util.HashSet;

import org.assertj.core.util.Sets;

import spring.test.model.User;

public class Users {

	private Collection<User> users;
	
	public Users() {
		this.users = new HashSet<>();
	}
	
	public void addUser(User... user) {
		this.users.addAll(Sets.newLinkedHashSet(user));
	}
	
	@Override
	public String toString() {
		return this.users.toString();
	}
}
