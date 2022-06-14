package pl.migibud.workbook.codewars.ex13;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String input = "RqaEzty";

        String collect = Arrays.stream(input.split(""))
                .collect(Collectors.joining("-"));

        System.out.println(collect);

        String[] strings = collect.split("");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            if ("-".equals(strings[i])) {
                stringBuilder.append(strings[i]);
                continue;
            }
            stringBuilder.append(strings[i].repeat(i + 1));
        }

        String s = stringBuilder.toString();

        String collect1 = Arrays.stream(s.split("-"))
                .map(v -> v.substring(0, 1).toUpperCase().concat(v.substring(1).toLowerCase()))
                .collect(Collectors.joining("-"));


        System.out.println(collect1);

        String text = "Ala";

        String streamStream = Arrays.stream(text.split(""))
                .flatMap(v -> IntStream.range(0, 3).mapToObj(v::repeat))
                .collect(Collectors.joining(""));

        System.out.println(streamStream);

        IntStream.range(0, 3).forEach(System.out::println);

        System.out.println(accum("RqaEzty"));

        String[] ala = "ala".split("");

        StringBuilder stringBuilder1 = new StringBuilder();

//        for (int i = 0;i<ala.length();i++){
//            stringBuilder1.append()
//        }

        String stringStream = IntStream.range(0, 3).mapToObj("c"::repeat).collect(Collectors.joining(""));
        System.out.println(stringStream);

    }

    public static String accum(String s) {

        String[] strings = String
                .join("-", s.split(""))
                .split("");

        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if ("-".equals(strings[i])) {
                stringBuilder.append(strings[i]);
                continue;
            }
            stringBuilder.append(strings[i].repeat(counter + 1));
            counter++;
        }
        return Arrays.stream(stringBuilder.toString().split("-"))
                .map(v -> v.substring(0, 1).toUpperCase().concat(v.substring(1).toLowerCase()))
                .collect(Collectors.joining("-"));
    }

    public static String accum2(String s) {
        return IntStream.range(0, s.length())
                .mapToObj(i -> Stream.generate(() -> s.charAt(i)).limit(i + 1).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString())
                .map(a -> a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase())
                .collect(Collectors.joining("-"));
    }
}
