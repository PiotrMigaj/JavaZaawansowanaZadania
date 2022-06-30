package pl.migibud.workbook.codewars.ex23;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int number = 70304;

        System.out.println(number%10);

        String[] split = String.valueOf(number).split("");

        System.out.println(Arrays.toString(split));

        Map<Integer,String> map = new TreeMap<>(Comparator.reverseOrder());

        for (int i =0;i< split.length;i++){
            map.put(i,split[split.length-i-1]);
        }


        Map.Entry<Integer,String> entry = map.entrySet().iterator().next();

        String value = entry.getValue();
        Integer key = entry.getKey();

        String repeat = value+"0".repeat(key);

        System.out.println(repeat);

        System.out.println(entry);

        System.out.println(map);

    }
}
