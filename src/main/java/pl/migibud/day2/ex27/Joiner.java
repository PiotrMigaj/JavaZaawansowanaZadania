package pl.migibud.day2.ex27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner<T> {

    private String separator;
    T[] myArray;

    public Joiner(String separator) {
        this.separator = separator;
//        myArray = new T[10];
        myArray = (T[]) new Object[10];
    }

    public String join(T... t){
        return Arrays.stream(t)
                .map(Object::toString)
                .collect(Collectors.joining(separator));
    }


}
