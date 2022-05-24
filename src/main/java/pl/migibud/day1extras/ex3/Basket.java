package pl.migibud.day1extras.ex3;

import pl.migibud.day1extras.ex2.Programmer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Basket {

    private final List<Order> orderList;

    public Basket() {
        this.orderList = new ArrayList<>();
    }

    public boolean addOrderToBasket(Order order){
        if(order==null){
            return false;
        }
        this.orderList.add(order);
        return true;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public List<Product> getListOfProductsWithCategoryComputerAndPriceHigherThan5000PLN(){
        return this.orderList.stream()
                .flatMap(v->v.getProductList().stream())
                .filter(v->v.getCategory().equalsIgnoreCase("Computer"))
                .filter(v->v.getPrice()>5000.0)
                .collect(Collectors.toList());
    }

    public List<Product> getListOfProductsWithCategoryComputerAddingExtraDiscount20Percent(){
        return this.orderList.stream()
                .flatMap(v->v.getProductList().stream())
                .peek(v->v.setDicountedPrice(0.2))
                .collect(Collectors.toList());
    }

    public Product getCheapestProductWithCategoryComputer(){
        return this.orderList.stream()
                .flatMap(v->v.getProductList().stream())
                .filter(v->v.getCategory().equals("Computer"))
                .sorted((p1,p2)->(int)(p1.getPrice()-p2.getPrice()))
                .findFirst()
                .orElseThrow(()->new RuntimeException("There are no products with category Computer"));
    }

    public List<Order> getListOfOrdersContainsProductWithCategoryBook(){
        return this.orderList.stream()
                .filter(v->v.getProductList().stream().anyMatch(c->c.getCategory().equals("Book")))
                .collect(Collectors.toList());
    }

    public List<Product> getListOfProductsOrderedBetween2022_01_01And2022_02_01(){
        return this.orderList.stream()
                .filter(v->v.getLocalDate().isAfter(LocalDate.of(2022,1,1)))
                .filter(v->v.getLocalDate().isBefore(LocalDate.of(2022,2,1)))
                .flatMap(v->v.getProductList().stream())
                .collect(Collectors.toList());
    }

    public List<Order> getListOfTwoLatestOrders(){
        return this.orderList.stream()
                .sorted((o1,o2)->o2.getLocalDate().compareTo(o1.getLocalDate()))
                .limit(2)
                .collect(Collectors.toList());
    }

    public double sumOfAllProductsFromOldestOrder(){
        return this.orderList.stream()
                .sorted(Comparator.comparing(Order::getLocalDate))
                .limit(1)
                .flatMap(v->v.getProductList().stream())
                .mapToDouble(Product::getPrice)
                .sum();
    }




}
