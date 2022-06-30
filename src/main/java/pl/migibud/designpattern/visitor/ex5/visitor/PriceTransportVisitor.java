package pl.migibud.designpattern.visitor.ex5.visitor;

import pl.migibud.designpattern.visitor.ex5.shipment.Animal;
import pl.migibud.designpattern.visitor.ex5.shipment.Person;
import pl.migibud.designpattern.visitor.ex5.shipment.Shipment;

public class PriceTransportVisitor implements TransportVisitor {
	@Override
	public void visit(Animal animal) {
		System.out.println(animal.getWeight()*0.2);
	}

	@Override
	public void visit(Person person) {
		int price = 6;
		if (person.isRegularCustomer()) {
			price = price / 2;
		}
		System.out.println("Price per kilometer for a person: "
				+ price + " PLN");
	}

	@Override
	public void visit(Shipment shipment) {
		System.out.println(3);
	}
}
