package pl.migibud.workbook.intstream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        int n=42;
//         IntStream.range(0,n)
//                .map(i->(n*(n-1)+1)+2*i)
//                .sum();

        List<Integer> myList = new ArrayList<>();



        IntStream.range(0,10)
                .forEach(i->myList.add(i));

        System.out.println(myList);

    }
}
