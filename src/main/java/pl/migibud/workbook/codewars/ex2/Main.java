package pl.migibud.workbook.codewars.ex2;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int sum = solution(-5);
        System.out.println(sum);
    }

    private static int solution(int number) {
        if (number<0){
            return 0;
        }
        return IntStream.range(0, number)
                .filter(v -> (v % 3 == 0 || v % 5 == 0))
                .sum();
    }
}
