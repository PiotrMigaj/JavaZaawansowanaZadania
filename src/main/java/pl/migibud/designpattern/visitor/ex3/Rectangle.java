package pl.migibud.designpattern.visitor.ex3;

public class Rectangle implements Shape {



	@Override
	public void accept(Visitor visitor) {
		visitor.visitRectangle(this);
	}
}
