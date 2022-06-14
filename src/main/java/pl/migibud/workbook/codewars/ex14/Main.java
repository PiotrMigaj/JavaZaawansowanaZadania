package pl.migibud.workbook.codewars.ex14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        String text = "ala";

        List<String> collect = IntStream.range(0, 3).mapToObj(i -> Arrays.stream(text.split("")).limit(i).map(v -> v.repeat(i+1)).collect(Collectors.joining("-"))).collect(Collectors.toList());
        System.out.println(collect);

    }
}
