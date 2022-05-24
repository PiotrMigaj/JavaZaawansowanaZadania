package pl.migibud.day1extras.ex3;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product computer1 = Product.builder()
                .id(1231L)
                .name("PC Computer")
                .category("Computer")
                .price(6520.0)
                .build();

        Product computer2 = Product.builder()
                .id(3214L)
                .name("Laptop")
                .category("Computer")
                .price(8500.0)
                .build();

        Product computer3 = Product.builder()
                .id(1008L)
                .name("Monitor")
                .category("Computer")
                .price(1500.0)
                .build();

        Order computerOrder = new Order(1540L, LocalDate.of(2022,01,20), List.of(computer1,computer2,computer3));

        Product book1 = Product.builder()
                .id(3566L)
                .name("Harry Potter")
                .category("Book")
                .price(35.0)
                .build();

        Product book2 = Product.builder()
                .id(2221L)
                .name("Lord of The Rings")
                .category("Book")
                .price(122.0)
                .build();

        Product book3 = Product.builder()
                .id(1999L)
                .name("Splendor")
                .category("Book")
                .price(150.0)
                .build();

        Order bookOrder = new Order(2222L, LocalDate.of(2022,01,25), List.of(book1,book2,book3));

        Basket basket = new Basket();
        basket.addOrderToBasket(computerOrder);
        basket.addOrderToBasket(bookOrder);

        System.out.println(basket.getListOfProductsWithCategoryComputerAndPriceHigherThan5000PLN().size());

        computer1.setDicountedPrice(0.2);
        System.out.println(computer1);





    }

}
