package pl.migibud.designpattern.visitor.ex1;

public interface Visitor {

	void visit(Building building);
	void visit(Bungalow bungalow);
	void visit(OfficeBuilding officeBuilding);
	void visit(SkyScrapper skyScrapper);
}
