package pl.migibud.workbook.listcontainsmulti;

import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("java");
        myList.add("c#");
        myList.add("c++");

        myList.retainAll(List.of("java","Java"));
//        System.out.println(myList.size()==1);
        System.out.println(!ListUtils.intersection(myList,List.of("java","Java")).isEmpty());
    }

}
