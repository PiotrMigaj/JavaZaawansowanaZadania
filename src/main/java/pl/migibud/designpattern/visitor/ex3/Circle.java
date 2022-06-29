package pl.migibud.designpattern.visitor.ex3;

public class Circle implements Shape {



	@Override
	public void accept(Visitor visitor) {
		visitor.visitCircle(this);
	}
}
