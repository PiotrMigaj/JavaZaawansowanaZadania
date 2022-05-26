package pl.migibud.workbook.mapPutIfAbsent;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Ania", 3);

        myMap.computeIfPresent("Ania", (k, v) -> v+1);


        System.out.println(myMap);

    }
}
