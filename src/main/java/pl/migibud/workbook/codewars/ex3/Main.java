package pl.migibud.workbook.codewars.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String newString = "1 2 3 4 5";

        List<Integer> myList = Arrays.stream(newString.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String newOne = myList.stream().max(Integer::compareTo).get().toString()
                +" "
                +myList.stream().min(Integer::compareTo).get().toString();
        System.out.println(newOne);

    }
}
