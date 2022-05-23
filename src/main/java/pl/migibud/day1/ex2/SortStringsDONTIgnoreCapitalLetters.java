package pl.migibud.day1.ex2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsDONTIgnoreCapitalLetters implements StringSortable {

    @Override
    public List<String> sortListOfStrings(List<String> unsorted) {
        return unsorted.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
