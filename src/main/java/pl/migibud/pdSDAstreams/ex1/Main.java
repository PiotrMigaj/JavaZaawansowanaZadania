package pl.migibud.pdSDAstreams.ex1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> results = getAllStringsThatStartsWithSmallCAndLengthIsEquals3(List.of("Piotr","cyc"));
        System.out.println(results);

        System.out.println(getString(List.of(5,20)));
    }

    public static List<String> getAllStringsThatStartsWithSmallCAndLengthIsEquals3(List<String> input){
        return input.stream()
                .filter(s->s.startsWith("c"))
                .filter(s->s.length()==3)
                .collect(Collectors.toList());
    }

    public static String getString(List<Integer> values){

//        return values.stream()
//                .map(i->i%2==0?"o"+i:"e"+i)
//                .collect(Collectors.joining(" "));

        return values.stream()
                .map(i->{
                    if (i%2==0){
                        return "o"+i;
                    }else{
                        return "e"+i;
                    }
                })
                .collect(Collectors.joining(" "));

    }
}
