package pl.migibud.designpattern.visitor.ex1;

public interface BuildingType {
	void accept(Visitor visitor);
	int getFloor();
}
