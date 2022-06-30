package pl.migibud.designpattern.visitor.ex5.shipment;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import pl.migibud.designpattern.visitor.ex5.visitor.TransportVisitor;

@AllArgsConstructor
@ToString
@Getter
@EqualsAndHashCode
public class Person implements Transportable{

	private String firstName;
	private String lastName;
	private boolean isRegularCustomer;

	@Override
	public void accept(TransportVisitor visitor) {
		visitor.visit(this);
	}
}
