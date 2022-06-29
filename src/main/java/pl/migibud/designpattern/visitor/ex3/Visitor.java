package pl.migibud.designpattern.visitor.ex3;

public interface Visitor {
	void visitCircle(Circle circle);
	void visitTriangle(Triangle triangle);
	void visitRectangle(Rectangle rectangle);
}
