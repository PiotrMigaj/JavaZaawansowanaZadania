package pl.migibud.designpattern.visitor.ex5.visitor;

import pl.migibud.designpattern.visitor.ex5.shipment.Animal;
import pl.migibud.designpattern.visitor.ex5.shipment.Person;
import pl.migibud.designpattern.visitor.ex5.shipment.Shipment;

public class NameTransportVisitor implements TransportVisitor {
	@Override
	public void visit(Animal animal) {
		System.out.println(animal.getKind());
	}

	@Override
	public void visit(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName());
	}

	@Override
	public void visit(Shipment shipment) {
		System.out.println(shipment.getPrefix() + " "+shipment.getSerialNumber());
	}
}
