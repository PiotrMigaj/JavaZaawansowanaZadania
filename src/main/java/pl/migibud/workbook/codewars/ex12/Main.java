package pl.migibud.workbook.codewars.ex12;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[] {5,-3,4};
        System.out.println(squareSum(a));

    }

    public static int squareSum(int[] n)
    {
        return Arrays.stream(n)
                .reduce(0,(v1,v2)->v1+v2*v2);
    }

}
