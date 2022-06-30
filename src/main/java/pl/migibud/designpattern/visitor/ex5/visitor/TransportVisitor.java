package pl.migibud.designpattern.visitor.ex5.visitor;

import pl.migibud.designpattern.visitor.ex5.shipment.Animal;
import pl.migibud.designpattern.visitor.ex5.shipment.Person;
import pl.migibud.designpattern.visitor.ex5.shipment.Shipment;

public interface TransportVisitor {

	void visit(Animal animal);
	void visit(Person person);
	void visit(Shipment shipment);
}
