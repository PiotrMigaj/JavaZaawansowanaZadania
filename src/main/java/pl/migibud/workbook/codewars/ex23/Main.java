package pl.migibud.workbook.codewars.ex23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int number = 70304;

        System.out.println(number%10);

        String[] split = String.valueOf(number).split("");

        Arrays.toString(split);
    }
}
