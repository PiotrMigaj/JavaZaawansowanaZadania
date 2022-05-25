package pl.migibud.day1.ex14;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyIntegerListUtil {

    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> myList = random.ints()
                .limit(100_000)
                .boxed()
                .collect(Collectors.toList());

//        System.out.println(integerList);

        //List<Integer> myList = List.of(1,2,3,1,2,2,2,4,5,21,11,12,13,14,15,16,1,17,18,19,20,21,22,25,26,27,28,29,30,10,32,33);

        System.out.println(myList);

        Map<Integer,Long> myMap = myList.stream()
                .collect(Collectors.groupingBy(v->v,Collectors.counting()));

        System.out.println(getUniqueSetOfIntegers(myList).size());
        System.out.println(getMapOfIntegersWithNumberOfOccurrence(myList).size());
        System.out.println(getListOfElementsThatOccurMoreThanOnce(myList).size());
        System.out.println(get25MostCommonsIntegers(myList).size());

    }

    public static Set<Integer> getUniqueSetOfIntegers(List<Integer> myList){
        return new HashSet<>(myList);
    }

    public static Map<Integer,Long> getMapOfIntegersWithNumberOfOccurrence(List<Integer> myList){
        return myList.stream()
                .collect(Collectors.toMap(Function.identity(),v->1L, Long::sum));
    }

    public static List<Integer> getListOfElementsThatOccurMoreThanOnce(List<Integer> myList){
        return myList.stream()
                .collect(Collectors.toMap(Function.identity(),v->1L, Long::sum))
                .entrySet()
                .stream()
                .filter(v->v.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static List<Integer> get25MostCommonsIntegers(List<Integer> myList){
        return myList.stream()
                .collect(Collectors.toMap(Function.identity(),v->1L, Long::sum))
                .entrySet()
                .stream()
                .sorted((v1,v2)->(int)(v2.getValue()-v1.getValue()))
                .map(Map.Entry::getKey)
                .limit(25)
                .collect(Collectors.toList());
    }



}
