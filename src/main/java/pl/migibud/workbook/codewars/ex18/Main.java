package pl.migibud.workbook.codewars.ex18;

import java.util.Arrays;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {

        int[] ints = new int[]{2,2,2,2,2,2};

        int reduce = Arrays.stream(ints)
                .reduce((i1, i2) -> i1 * i2).getAsInt();

        System.out.println(reduce);


    }

}
