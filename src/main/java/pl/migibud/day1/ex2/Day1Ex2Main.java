package pl.migibud.day1.ex2;

import java.util.List;

public class Day1Ex2Main {

    public static void main(String[] args) {

        List<String> input = List.of("Asia","asia","Ala","Piotr","piotr","Zenon","wojtek","maria");

        SortingStrategy strategyIgnoreCapitalLetters = new SortingStrategy(new SortStringsIgnoreCapitalLetters());
        System.out.println(strategyIgnoreCapitalLetters.sortListOfStrings(input));

        SortingStrategy strategyDONTIgnoreCapitalLetters = new SortingStrategy(new SortStringsDONTIgnoreCapitalLetters());
        System.out.println(strategyDONTIgnoreCapitalLetters.sortListOfStrings(input));

    }

}
