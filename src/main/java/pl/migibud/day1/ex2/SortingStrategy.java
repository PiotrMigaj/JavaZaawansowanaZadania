package pl.migibud.day1.ex2;

import java.util.List;

public class SortingStrategy implements StringSortable {

    private StringSortable stringSortable;

    public SortingStrategy(StringSortable stringSortable) {
        this.stringSortable = stringSortable;
    }

    @Override
    public List<String> sortListOfStrings(List<String> unsorted) {
        return this.stringSortable.sortListOfStrings(unsorted);
    }
}
