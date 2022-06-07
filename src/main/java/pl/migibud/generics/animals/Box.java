package pl.migibud.generics.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box {

//    List<?> boxList;
//
//    public Box(List<? super Number> boxList) {
//        this.boxList = boxList;
//    }

//    public void add(Number n){
//        boxList.add(n);
//    }

//    public void print(List<? super Number> input){
//        for (Number o:input) {
//            System.out.println(o.toString());
//        }
//    }

    public static void main(String[] args) {

        List<? super Number> input = new ArrayList<>();

        input.add(3);
        input.add(3.2);
        input.add(3.25);

        for (Object number:input) {
            System.out.println(number);
        }


    }
}
