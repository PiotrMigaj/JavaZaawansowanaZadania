package pl.migibud.day1.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Piotr");
        stringList.add("Ania");

        System.out.println(Day1Ex1.sortUsingMyOwnComparatorClass(stringList));

    }
}
