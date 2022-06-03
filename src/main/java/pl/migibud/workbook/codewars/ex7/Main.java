package pl.migibud.workbook.codewars.ex7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String one = "anothertest";
        String two = "notatest";

//        Set<String> set1 = Arrays.stream(one.split(""))
//                .collect(Collectors.toSet());
//
//        Set<String> set2 = Arrays.stream(two.split(""))
//                .collect(Collectors.toSet());
//
//
//        set2.retainAll(set1);
//
//        System.out.println(set1);
        System.out.println(lcs(one,two));

    }

    static String lcs(String a, String b) {

        Set<String> set1 = Arrays.stream(a.split(""))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(set1);

        Set<String> set2 = Arrays.stream(b.split(""))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        set1.retainAll(set2);


        return set1.stream().reduce("",(v1,v2)->v1+v2);
    }
}
