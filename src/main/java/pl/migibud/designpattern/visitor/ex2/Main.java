package pl.migibud.designpattern.visitor.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<ShoppingItem> shoppingItems = new ArrayList<>();
		shoppingItems.add(new Table("desk",20));
		shoppingItems.add(new Chair("chair1",30));
		shoppingItems.add(new Chair("chair2",15));

		double sum = 0;

		ShoppingCartVisitor shoppingCart = new ShoppingCart();

		for (ShoppingItem shoppingItem:shoppingItems) {
			sum+= shoppingItem.accept(shoppingCart);
		}

		System.out.println(sum);

	}
}
