package pl.migibud.SDAexercisesJavaAdvancedProgramming.ex10and11;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Basket {

    private final List<Product> productList;

    public Basket() {
        this.productList = new ArrayList<>();
    }

    public boolean addProductToBasket(Product product){
        if (product==null){
            return false;
        }
        return this.productList.add(product);
    }

    public boolean removeProductFromBasket(Product product){
        if (product==null){
            return false;
        }
        return this.productList.remove(product);
    }

    public List<Product> getProductList(){
        return List.copyOf(this.productList);
    }
}
