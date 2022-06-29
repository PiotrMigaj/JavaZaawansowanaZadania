package pl.migibud.designpattern.visitor.ex2;

public interface ShoppingItem {
	public double accept(ShoppingCartVisitor visitor);
}
