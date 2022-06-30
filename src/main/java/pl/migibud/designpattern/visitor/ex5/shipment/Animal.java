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
public class Animal implements Transportable {

	private String kind;
	private int weight;

	@Override
	public void accept(TransportVisitor visitor) {
		visitor.visit(this);
	}
}
