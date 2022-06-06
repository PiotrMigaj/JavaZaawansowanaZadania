package pl.migibud.workbook.intstream;


import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        int n=42;
//         IntStream.range(0,n)
//                .map(i->(n*(n-1)+1)+2*i)
//                .sum();

        List<String> names = new ArrayList<>(List.of("Piotr","Ania","Basia"));

        List<Integer> ages = new ArrayList<>(List.of(30,28,1));

        List<Integer> sortedAge = sortListBaseOnAnotherListSortingOrder(names,String::compareTo,ages);
        System.out.println(sortedAge);


    }

    public static <K,T> List<T> sortListBaseOnAnotherListSortingOrder(List<K> myTemplateList, Comparator<K> myTemplateListComparator,List<T> listToBeSorted){

        Map<K,T> mySortingMap = new TreeMap<>(myTemplateListComparator);
        IntStream.range(0,myTemplateList.size())
                .forEach(i->mySortingMap.put(myTemplateList.get(i),listToBeSorted.get(i)));

        return mySortingMap.entrySet().stream()
                .map(v -> v.getValue())
                .collect(Collectors.toList());
    }
}
