package pl.migibud.designpattern.visitor.ex1;

public class Main {
	public static void main(String[] args) {

		Building building = new Building();
		building.accept(new FloorVisitor());


	}
}
