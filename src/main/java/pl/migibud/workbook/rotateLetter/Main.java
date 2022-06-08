package pl.migibud.workbook.rotateLetter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String text = "Hello, world. ?";
        text = text
                .replaceAll(","," ,")
                .replaceAll("\\."," .");
        System.out.println(text);

        List<String> tmpList2 = Arrays.stream(text.split(" ")).collect(Collectors.toList());

        String collect = Arrays.stream(text.split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1).concat("ay")) : v)
                .collect(Collectors.joining(" "));

        collect = collect
                .replaceAll(" ,",",")
                .replaceAll(" \\.",".");

        System.out.println(collect);


        List<String> outPutList = new ArrayList<>();
        for (String s : tmpList2) {
            if (s.matches("[!?]")) {
                outPutList.add(s);
                continue;
            }
            if (s.endsWith(",")) {
                List<String> tmpList = Arrays.stream(s.split("")).collect(Collectors.toList());
                Collections.rotate(tmpList, -1);
                tmpList.add("ay");
                String text2 = String.join("", tmpList);
                text2 = text2.replaceAll(",","") + ",";
                outPutList.add(text2);
                continue;
            }
            if (s.endsWith(".")) {
                List<String> tmpList = Arrays.stream(s.split("")).collect(Collectors.toList());
                Collections.rotate(tmpList, -1);
                tmpList.add("ay");
                String text2 = String.join("", tmpList);
                text2 = text2.replaceAll("\\.","") + ".";
                outPutList.add(text2);
                continue;
            }
            List<String> tmpList = Arrays.stream(s.split("")).collect(Collectors.toList());
            Collections.rotate(tmpList, -1);
            tmpList.add("ay");
            outPutList.add(String.join("", tmpList));
        }

        String outPutString = String.join(" ", outPutList);

        System.out.println(outPutString);

    }
}
