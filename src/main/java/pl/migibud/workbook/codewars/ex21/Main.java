package pl.migibud.workbook.codewars.ex21;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] ints = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<ints.length;i++){
            map.put(i,ints[i]);
        }

        List<Integer> orders = map.entrySet().stream()
                .filter(v->v.getValue()%2!=0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        List<Integer> sortedValues = map.values().stream()
                .filter(integer -> integer % 2 != 0)
                .sorted()
                .collect(Collectors.toList());

        for (int i =0;i< orders.size();i++){
            map.put(orders.get(i),sortedValues.get(i));
        }


        int[] ints1 = map.values().stream()
                .mapToInt(i -> i)
                .toArray();

        System.out.println(Arrays.toString(ints1));

//        public class Kata {
//            public static int[] sortArray(int[] array) {
//                OfInt sortedOdds = IntStream
//                        .of(array)
//                        .filter(i -> i % 2 == 1)
//                        .sorted()
//                        .iterator();
//
//                return IntStream
//                        .of(array)
//                        .map(i -> i % 2 == 0 ? i : sortedOdds.nextInt())
//                        .toArray();
//            }
//        }
    }
}
