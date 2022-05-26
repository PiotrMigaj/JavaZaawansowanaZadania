package pl.migibud.SDAexercisesJavaAdvancedProgramming.ex12and13;

import lombok.ToString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ToString
public class Basket {

    private final Map<Product,Integer> productMap;

    public Basket() {
        this.productMap = new HashMap<>();
    }

    public boolean addProductToBasket(Product product){
        if (product==null){
            return false;
        }
        this.productMap.compute(product,(k, v)->v==null?1:v+1);
        return true;
    }

    public boolean removeProductFromBasket(Product product){
        if (product==null){
            return false;
        }
        if (!this.productMap.containsKey(product)){
            return false;
        }
        if (this.productMap.get(product).equals(1)){
            this.productMap.remove(product);
            return true;
        }
        this.productMap.computeIfPresent(product,(k,v)->v-1);
        return true;
    }

    public List<Product> getProductList() {
        return List.copyOf(productMap.keySet());
    }

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }
}
