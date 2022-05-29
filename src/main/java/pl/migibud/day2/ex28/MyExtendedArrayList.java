package pl.migibud.day2.ex28;

import java.util.ArrayList;
import java.util.List;

public class MyExtendedArrayList<E> extends ArrayList<E> {

    public List<E> getEveryNthElement(int startIndex, int skip){
        List<E> tmpList = new ArrayList<>();
        for (int i=startIndex;i<this.size();i=i+skip+1){
            tmpList.add(this.get(i));
        }
        return tmpList;
    }

}

