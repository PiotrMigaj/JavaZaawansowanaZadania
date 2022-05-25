package pl.migibud.workbook.comparator;

import java.util.ArrayList;
import java.util.List;

public class MyTestClass {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>(List.of("Piotr", "Wojtek", "Ania"));

        myList.add("Leopold");

        myList.sort(SortStrategy.chooseSorting(SortingType.DESCENDING));
        System.out.println(myList);



    }

}
