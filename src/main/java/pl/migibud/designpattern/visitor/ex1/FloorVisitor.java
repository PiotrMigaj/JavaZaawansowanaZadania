package pl.migibud.designpattern.visitor.ex1;

public class FloorVisitor implements Visitor{
	@Override
	public void visit(Building building) {
		System.out.println(building.getFloor());
	}

	@Override
	public void visit(Bungalow bungalow) {
		System.out.println(bungalow.getFloor());
	}

	@Override
	public void visit(OfficeBuilding officeBuilding) {
		System.out.println(officeBuilding.getFloor());
	}

	@Override
	public void visit(SkyScrapper skyScrapper) {
		System.out.println(skyScrapper.getFloor());
	}
}
