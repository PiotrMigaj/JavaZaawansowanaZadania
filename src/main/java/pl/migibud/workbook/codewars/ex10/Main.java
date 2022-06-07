package pl.migibud.workbook.codewars.ex10;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] input = new String[] {};

        Integer collect = Arrays.stream(input)
                .collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum))
                .entrySet().stream()
                .map(Map.Entry::getValue)
                .map(v->v/2)
                .reduce(Integer::sum)
                .orElse(0);

        System.out.println(collect);

    }

    public static int numberOfPairs(String[] gloves) {
        return Arrays.stream(gloves)
                .collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum))
                .entrySet().stream()
                .map(Map.Entry::getValue)
                .map(v->v/2)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
