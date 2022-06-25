package pl.migibud.designpattern.visitor.ex1;

public class Bungalow implements BuildingType{

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public int getFloor() {
		return 1;
	}
}
