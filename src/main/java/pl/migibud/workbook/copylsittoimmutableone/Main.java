package pl.migibud.workbook.copylsittoimmutableone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("piotr");
        myList.add("anna");
        myList.add("beata");
        myList.add("wojtek");

        System.out.println(myList);
        System.out.println();

        List<String> myCopiedList = List.copyOf(myList);
        System.out.println(myCopiedList);
        myList.set(0,"Cysia");
        System.out.println(myList);
        System.out.println(myCopiedList);
    }

}
