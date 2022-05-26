package pl.migibud.SDAexercisesJavaAdvancedProgramming.ex12and13;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket();

        Product milk = new GenericProduct(()->10.0, localDate -> localDate.isAfter(LocalDate.now()));
        Product bread = new GenericProduct(()->25.0, localDate -> true);

        basket.addProductToBasket(milk);
        basket.addProductToBasket(milk);
        basket.addProductToBasket(milk);
        basket.addProductToBasket(milk);
        basket.addProductToBasket(milk);
        basket.addProductToBasket(bread);

        System.out.println(basket.getProductMap());

        System.out.println();

        System.out.println(basket.removeProductFromBasket(milk));

        System.out.println(basket.getProductMap());

        System.out.println(OrderService.getTotalPriceOfAllProductInBasket(basket));





    }
}
