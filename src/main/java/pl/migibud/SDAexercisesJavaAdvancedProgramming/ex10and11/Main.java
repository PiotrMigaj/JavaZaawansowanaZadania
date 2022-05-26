package pl.migibud.SDAexercisesJavaAdvancedProgramming.ex10and11;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket();

        Product milk = new GenericProduct(()->10.0,localDate -> localDate.isAfter(LocalDate.now()));
        Product bread = new GenericProduct(()->25.0,localDate -> true);

        basket.addProductToBasket(milk);
        basket.addProductToBasket(bread);

        List<Product> products = basket.getProductList();
        System.out.println(products);
        System.out.println(basket.getProductList());

        basket.removeProductFromBasket(milk);
        System.out.println(basket.getProductList());


    }
}
