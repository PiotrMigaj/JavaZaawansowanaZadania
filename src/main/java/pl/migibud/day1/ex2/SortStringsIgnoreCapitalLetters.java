package pl.migibud.day1.ex2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsIgnoreCapitalLetters implements StringSortable {

    @Override
    public List<String> sortListOfStrings(List<String> unsorted) {
        return unsorted.stream().sorted((o1,o2)->o2.compareToIgnoreCase(o1)).collect(Collectors.toList());
    }
}
