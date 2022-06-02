package pl.migibud.workbook.codewars.ex5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3,0};
        int max = Arrays.stream(array).max()
                .getAsInt();
        int min = Arrays.stream(array).min()
                .getAsInt();

        System.out.println(max+" "+min);

    }

    public static Double multiply(Double a, Double b) {
        return a * b;
    }
}
