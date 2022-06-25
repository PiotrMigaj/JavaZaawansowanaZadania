package pl.migibud.designpattern.mediator.ex1;

import lombok.ToString;

@ToString
public class User {

	private String name;
	private Mediator mediator;

	public User(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
		this.mediator.addUser(this);
	}

	public void receive(String message){
		System.out.println("Uzytkownik "+this.name+" otrzymal wiadomosc: "+message);
	}

	public void send(String message){
		mediator.send(message,this);
	}
}
