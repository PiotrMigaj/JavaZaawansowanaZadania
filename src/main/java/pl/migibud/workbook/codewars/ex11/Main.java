package pl.migibud.workbook.codewars.ex11;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(a, b));

//        IntStream.range(0, a.length).forEach(i->a[i]=a[i]*a[i]);
//
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//
//        boolean equals = Arrays.equals(a, b);
//        System.out.println(equals);

//        AtomicBoolean checker = new AtomicBoolean(true);
//
//        IntStream.range(0, a.length).forEach(i-> checker.set(a[i] == b[i]));
//        boolean b1 = IntStream.range(0, a.length).anyMatch(i -> a[i] == b[i]);
//
//        System.out.println(b1);


    }

    public static boolean comp(int[] a, int[] b) {

        if (a == null || b == null) {
            return false;
        }
        if (a.length == 0 && b.length == 0) {
            return false;
        }
        IntStream.range(0, a.length).forEach(i -> a[i] = a[i] * a[i]);
        Arrays.sort(a);
        Arrays.sort(b);
        return IntStream.range(0, a.length).allMatch(i -> a[i] == b[i]);
    }
}
