package pl.migibud.workbook.codewars.ex15;

import java.util.Arrays;
import java.util.Objects;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        if (arrayOfSheeps==null||arrayOfSheeps.length==0){
            return 0;
        }
//        return (int)Arrays.stream(arrayOfSheeps)
//                .map(v->v= v==null||v==false?false:true)
//                .filter(v->v.equals(true))
//                .count();

        return (int)Arrays.stream(arrayOfSheeps)
                .filter(Objects::nonNull)
                .filter(v->v.equals(true))
                .count();
    }

    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        Boolean[] array2 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  null };

        Counter counter = new Counter();
        int i = counter.countSheeps(array2);
        System.out.println(i);


    }
}
