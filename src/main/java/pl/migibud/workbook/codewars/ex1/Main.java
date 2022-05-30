package pl.migibud.workbook.codewars.ex1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdea"));
    }

    public static long duplicateCount(String text) {
        return (int)Arrays.stream(text.split(""))
                .collect(Collectors.toMap(k->k,v->1,Integer::sum))
                .entrySet()
                .stream()
                .filter(v->v.getValue()>1)
                .count();
    }
}
