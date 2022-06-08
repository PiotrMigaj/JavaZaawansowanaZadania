package pl.migibud.workbook.rotateLetter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String text = "Hello, world. ?";
        List<String> inputList = Arrays.stream(text.split(" ")).collect(Collectors.toList());

        List<String> outPutList = new ArrayList<>();
        for (String s : inputList) {
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
