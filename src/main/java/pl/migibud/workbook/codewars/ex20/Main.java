package pl.migibud.workbook.codewars.ex20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] ints = new int[]{ 1, 3, 2, 8, 5, 4 };

        List<Integer> collect = Arrays.stream(ints).boxed().map(v -> v % 2 == 0 ? 0 : v).collect(Collectors.toList());

        System.out.println(collect);


    }
}
