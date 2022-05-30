package pl.migibud.workbook.listcounttomap;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> myList = List.of("Piotr","Ania","Janusz","Ania","Piotr","Piotr");

        Map<String,Long> myMap = myList.stream()
                .collect(Collectors.groupingBy(v->v,Collectors.counting()));

        System.out.println(myMap);

        Long newOne = myMap.putIfAbsent("Piotr",5L);
        System.out.println(newOne);



    }
}
