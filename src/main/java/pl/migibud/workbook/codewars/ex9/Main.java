package pl.migibud.workbook.codewars.ex9;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String input = "aabBcde";
        int result = duplicateCount(input);
        System.out.println(result);
    }

    public static int duplicateCount(String text) {
        return (int) Arrays.stream(text.toLowerCase().split(""))
                .collect(Collectors.toMap(Function.identity(),v->1,Integer::sum))
                .values().stream()
                .filter(v->v>1)
                .count();
    }
}
