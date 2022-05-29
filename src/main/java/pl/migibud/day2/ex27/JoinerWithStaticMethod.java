package pl.migibud.day2.ex27;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinerWithStaticMethod {

    private String separator;

    public JoinerWithStaticMethod(String separator) {
        this.separator = separator;
    }

    public <T> String join(T... t){

        return Arrays.stream(t)
                .map(v->v.toString())
                .collect(Collectors.joining(separator));
    }


}
