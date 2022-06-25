package pl.migibud.designpattern.mediator.ex1;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

	private List<User> users = new ArrayList<>();

	public void addUser(User user){
		users.add(user);
	}

	public void send(String message, User sender){
		users.forEach(user -> {
			if (user!=sender){
				user.receive(message);
			}
		});
	}

}
