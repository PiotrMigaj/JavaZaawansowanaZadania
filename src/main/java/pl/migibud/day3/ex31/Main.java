package pl.migibud.day3.ex31;

import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        Path myPath = Paths.get("src/main/java/pl/migibud/day3/ex31/text.txt");
//        List<String> myContent = Files.readAllLines(myPath);
//
//        StringBuilder stringBuilder = new StringBuilder(myContent.stream().collect(Collectors.joining(" ")));
//        String[] outPut = stringBuilder.reverse().toString().split(" ");
//        List<String> myOutPutList = Arrays.asList(outPut);
//        System.out.println(Arrays.toString(outPut));
//
//        Files.write(Paths.get("src/main/java/pl/migibud/day3/ex31/text2.txt"),myOutPutList);

        FileWriter fileWriter = new FileWriter("src/main/java/pl/migibud/day3/ex31/text3.txt");
        fileWriter.append("Czesc piotr");
        fileWriter.append("Czesc piotr");
        fileWriter.close();









    }
}
