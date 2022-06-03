package pl.migibud.workbook.codewars.ex5;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{17,17,3,17};
        System.out.println(Arrays.toString(numbers));



        int map =  Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toMap(Function.identity(),v->1,Integer::sum))
                .entrySet().stream()
                .filter(v->v.getValue()==1)
                .map(Map.Entry::getKey)
                .reduce((v1,v2)->v1)
                .get();


        System.out.println(map);



    }
}
