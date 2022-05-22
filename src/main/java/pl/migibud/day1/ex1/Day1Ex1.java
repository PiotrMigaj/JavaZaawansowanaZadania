package pl.migibud.day1.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day1Ex1 {

    public static List<String> sortUsingAnonymousClass(List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        return sorted;
    }

    public static List<String> sortUsingMyOwnComparatorClass(List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyOwnComparator());
        return sorted;
    }

    public static List<String> sortUsingStream(List<String> unsorted){
        return unsorted.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
