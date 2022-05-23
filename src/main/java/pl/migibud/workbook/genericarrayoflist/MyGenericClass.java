package pl.migibud.workbook.genericarrayoflist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyGenericClass<T> {

    Object[] myArray;

    public MyGenericClass(int maxSize) {
        this.myArray = new Object[maxSize];
        for (int i=0;i<maxSize;i++){
            myArray[i]=new ArrayList<T>();
        }
    }




}
