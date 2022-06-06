package pl.migibud.workbook.sortarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("piotr");
        names.add("basia");
        names.add("ania");


        Integer[] indexes = {2, 0, 1};

        final int[] i = {0};
        Map<Integer, String> collect = names.stream()
                .collect(Collectors.toMap(v -> indexes[i[0]++], v -> v));

        System.out.println(collect);

        List<String> reorderedList = collect.entrySet().stream()
                .map(v->v.getValue())
                .collect(Collectors.toList());

        System.out.println(reorderedList);
    }

}
