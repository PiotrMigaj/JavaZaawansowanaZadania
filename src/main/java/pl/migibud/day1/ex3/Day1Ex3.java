package pl.migibud.day1.ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Day1Ex3 {

    public static String mapToString(Map<String,Integer> inputMap){
        String finalString = inputMap
                .entrySet()
                .stream()
                .map(k->"Klucz: " +k.getKey() + ", Wartość: "+k.getValue())
                .collect(Collectors.joining(",\n","","."));
        return finalString;
    }

    public static void main(String[] args) {

        Map<String,Integer> myMap = new HashMap<>();
        myMap.put("Java",18);
        myMap.put("Python",1);
        myMap.put("C#",10);
        myMap.put("Pascal",5);
        myMap.put("PHP",0);

        System.out.println(mapToString(myMap));

    }

}
