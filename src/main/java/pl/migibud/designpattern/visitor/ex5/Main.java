package pl.migibud.designpattern.visitor.ex5;

import pl.migibud.designpattern.visitor.ex5.shipment.Animal;
import pl.migibud.designpattern.visitor.ex5.shipment.Person;
import pl.migibud.designpattern.visitor.ex5.shipment.Shipment;
import pl.migibud.designpattern.visitor.ex5.shipment.Transportable;
import pl.migibud.designpattern.visitor.ex5.visitor.NameTransportVisitor;
import pl.migibud.designpattern.visitor.ex5.visitor.PriceTransportVisitor;

import javax.sql.rowset.spi.TransactionalWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Animal animal = new Animal("dog", 30);
		Person person = new Person("Dawid", "Nowak", true);
		Shipment shipment = new Shipment("PL", "4325452", false);

		List<Transportable> transportables = Arrays.asList(animal,person,shipment);

		transportables.forEach(t->t.accept(new PriceTransportVisitor()));
		transportables.forEach(t->t.accept(new NameTransportVisitor()));


	}
}
