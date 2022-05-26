package pl.migibud.SDAexercisesJavaAdvancedProgramming.ex12and13;

import java.util.stream.Collectors;

public class OrderService {

    private OrderService(){}

    public static Double getTotalPriceOfAllProductInBasket(Basket basket){

        return basket.getProductMap().entrySet().stream()
                .map(v->v.getKey().getPrice()*v.getValue())
                .reduce(Double::sum)
                .orElseThrow(()->new RuntimeException("There are no products in basket"));
    }

}
