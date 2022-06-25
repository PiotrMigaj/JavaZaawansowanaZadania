package pl.migibud.designpattern.mediator.ex1;

import javax.print.attribute.standard.Media;

public class Main {
	public static void main(String[] args) {

		Mediator mediator = new Mediator();
		User user1 = new User("Piotr",mediator);
		User user2 = new User("Ania",mediator);
		User user3 = new User("Basia",mediator);

		mediator.send("Kocham mocno",user1);

	}
}
