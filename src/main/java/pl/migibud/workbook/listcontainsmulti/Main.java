package pl.migibud.workbook.listcontainsmulti;

import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<String> myList = List.of("Java","C#","C++","Pascal");


//        myList.retainAll(List.of("java","Java"));
//        System.out.println(myList.size()==1);
        System.out.println(ListUtils.intersection(myList,List.of("java","Java","c#","C#")).size());
    }

}
