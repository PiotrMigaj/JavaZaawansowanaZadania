package pl.migibud.workbook.codewars.ex6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String preSorting = "IronMan;Thor;Captain America;Hulk\n"
                + "arrogant;divine;honorably;angry\n"
                + "armor;hammer;shield;greenhorn\n"
                + "Tony;Thor;Steven;Bruce";




        String result = Arrays.stream(preSorting.split("\n"))
                .map(v-> Arrays.stream(v.split(";")).sorted(String::compareToIgnoreCase).collect(Collectors.joining(";")))
                .collect(Collectors.joining("\n"));

        System.out.println(result);

    }
}
