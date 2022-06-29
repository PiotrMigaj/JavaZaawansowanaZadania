package pl.migibud.designpattern.visitor.ex3;

public class SaveCSVFile implements Visitor{
	@Override
	public void visitCircle(Circle circle) {
		System.out.println("saving circle...");
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		System.out.println("saving triangle...");
	}

	@Override
	public void visitRectangle(Rectangle rectangle) {
		System.out.println("saving rectangle...");
	}
}
