package pl.migibud.designpattern.visitor.ex5.shipment;

import pl.migibud.designpattern.visitor.ex5.visitor.TransportVisitor;

public interface Transportable {
	void accept(TransportVisitor visitor);
}
