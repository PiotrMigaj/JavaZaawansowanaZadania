package pl.migibud.designpattern.visitor.ex2;

public class ShoppingCart implements ShoppingCartVisitor{
	@Override
	public double visit(Table table) {
		return table.getPrice();
	}

	@Override
	public double visit(Chair chair) {
		return chair.getPrice();
	}
}
