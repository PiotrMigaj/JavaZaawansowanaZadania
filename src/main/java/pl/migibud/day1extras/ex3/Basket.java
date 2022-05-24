package pl.migibud.day1extras.ex3;

import pl.migibud.day1extras.ex2.Programmer;

import java.util.ArrayList;
import java.util.List;
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
}
