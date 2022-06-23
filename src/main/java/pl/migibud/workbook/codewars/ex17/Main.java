package pl.migibud.workbook.codewars.ex17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] array = {};


        int[] ints = Arrays.stream(array).boxed().mapToInt(i -> i * -1).toArray();

        System.out.println(Arrays.toString(ints));

    }

    public static int[] invert(int[] array) {

        return Arrays.stream(array).boxed().mapToInt(i -> i * -1).toArray();
    }
}
