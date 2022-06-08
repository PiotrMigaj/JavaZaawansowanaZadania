package pl.migibud.workbook.codewars.ex12;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        String text = "Hello, world ?";

        String collect = Arrays.stream(text.trim().split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .peek(System.out::println)
                .collect(Collectors.joining(" "));


        System.out.println(collect);
        System.out.println(text.replaceAll("(\\w)(\\w*)", "$2$1ay"));

    }
}
