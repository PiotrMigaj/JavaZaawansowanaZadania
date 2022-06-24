package pl.migibud.workbook.codewars.ex22;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        int[] ints = new int[] {100, 40, 34, 57, 29, 72, 57, 88};

        double average = Arrays.stream(ints)
                .average()
                .getAsDouble();

        System.out.println(average);
        System.out.println(betterThanAverage(ints,75));

    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double average = Arrays.stream(classPoints)
                .average()
                .getAsDouble();
        return yourPoints>average;
    }
}
