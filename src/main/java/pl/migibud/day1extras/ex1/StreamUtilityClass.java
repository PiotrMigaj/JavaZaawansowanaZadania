package pl.migibud.day1extras.ex1;

import java.util.List;
import java.util.stream.Collectors;

public class StreamUtilityClass {

    private StreamUtilityClass() {
    }

    public static List<String> search(List<String> values) {
        return values.stream().filter(v -> v.startsWith("c")).filter(v -> v.length() == 3).collect(Collectors.toList());
    }

    public static String getString(List<Integer> values) {
        return values.stream()
                .map(v -> v % 2 == 0 ? "e" + v : "o" + v)
                .collect(Collectors.joining(","));
    }
}
