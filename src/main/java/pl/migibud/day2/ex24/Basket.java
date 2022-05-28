package pl.migibud.day2.ex24;

import pl.migibud.day2.ex24.exceptions.BasketEmptyException;
import pl.migibud.day2.ex24.exceptions.BasketFullException;

public class Basket {

    private static final int MAX_CAPACITY = 10;
    private int items;

    public Basket() {
        items=0;
    }

    public void add(){
        if (items>= MAX_CAPACITY){
            throw new BasketFullException("Too many items in the basket!");
        }
        items++;
    }

    public void remove(){
        if (items== 0){
            throw new BasketEmptyException("Can't remove from basket!");
        }
        items--;
    }
}
