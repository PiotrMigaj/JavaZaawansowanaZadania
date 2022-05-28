package pl.migibud.day2.ex27;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... t){
        return Arrays.stream(t)
                .map(v->v.toString())
                .collect(Collectors.joining(separator));
    }


}
