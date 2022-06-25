package pl.migibud.designpattern.visitor.ex1;

import java.util.List;

public class Building implements BuildingType{

	private List<BuildingType> buildings;

	public Building() {
		buildings = List.of(new Bungalow(),new OfficeBuilding(),new SkyScrapper());
	}

	@Override
	public void accept(Visitor visitor) {
		buildings.forEach(b->b.accept(visitor));
		visitor.visit(this);
	}

	@Override
	public int getFloor() {
		return 50;
	}
}
