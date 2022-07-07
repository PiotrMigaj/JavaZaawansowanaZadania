package pl.migibud.workbook.codewars.ex26;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(longest("loopingisfunbutdangerous","lessdangerousthancoding"));
    }

    public static String longest (String s1, String s2) {

        Set<String> uniqueLetters = new TreeSet<>();

        uniqueLetters.addAll(Arrays.asList(s1.split("")));
        uniqueLetters.addAll(Arrays.asList(s2.split("")));

        return String.join("", uniqueLetters);
    }
}


