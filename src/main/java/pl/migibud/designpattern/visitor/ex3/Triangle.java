package pl.migibud.designpattern.visitor.ex3;

public class Triangle implements Shape {



	@Override
	public void accept(Visitor visitor) {
		visitor.visitTriangle(this);
	}
}
