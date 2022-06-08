package pl.migibud.workbook.testgenerics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<? super Number> myList = new ArrayList<>(List.of(1,2,2.2));

//        List<Double> doubleList = List.of(2.1,0.5);
//        List<Integer> integerList = List.of(1,2);
//
//        myList=integerList;


        System.out.println(myList.get(1) instanceof Integer);


    }

}
