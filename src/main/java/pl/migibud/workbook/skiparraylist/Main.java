package pl.migibud.workbook.skiparraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList = List.of(3,1,2,3,4,50,60,301,10,20,30);

        for (int i = 0;i< myList.size();i=i+4){
            System.out.println(myList.get(i));
        }


    }
}
