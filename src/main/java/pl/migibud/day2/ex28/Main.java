package pl.migibud.day2.ex28;

import java.util.List;

public class Main {

    public static void main(String[] args) {

/*        List<Integer> myList = List.of(1,2,3,40,50,60,1,2,60,10);*/

        MyExtendedArrayList<Integer> myList = new MyExtendedArrayList<>();
        myList.addAll(List.of(1,2,3,40,50,60,1,2,60,10));
        myList.add(35);

        System.out.println(myList.getEveryNthElement(2,4));


    }

}
