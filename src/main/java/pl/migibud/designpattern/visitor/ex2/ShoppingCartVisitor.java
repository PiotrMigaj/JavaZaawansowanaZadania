package pl.migibud.designpattern.visitor.ex2;

public interface ShoppingCartVisitor {
	public double visit(Table table);
	public double visit(Chair chair);
}
