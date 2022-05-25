package pl.migibud.workbook.comparator;

import java.util.Comparator;

public class SortStrategy {

    public static Comparator<String> chooseSorting(SortingType sortingType){

        switch (sortingType){
            case ASCENDING:
                return (String::compareTo);
            case DESCENDING:
                return (Comparator.reverseOrder());
            default:
                throw new RuntimeException();
        }
    }
}
