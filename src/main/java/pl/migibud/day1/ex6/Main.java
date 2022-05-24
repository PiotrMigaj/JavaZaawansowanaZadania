package pl.migibud.day1.ex6;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String,Integer> myMap = new TreeMap<>();
        myMap.put("Piotr",30);
        myMap.put("Ania",28);
        myMap.put("Basia",1);
        myMap.put("Iwona",60);

        printFirstAndLastEntrySetOfMap(myMap);
    }

    public static void printFirstAndLastEntrySetOfMap(TreeMap<String,Integer> inputMap){
        inputMap.entrySet().stream()
                .limit(1)
                .forEach(System.out::println);
        inputMap.entrySet().stream()
                .sorted(((o1, o2) -> o2.getKey().compareTo(o1.getKey())))
                .limit(1)
                .forEach(System.out::println);
    }

}
