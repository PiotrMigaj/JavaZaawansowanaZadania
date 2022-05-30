package pl.migibud.JavaIOzadania.ex1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Path myPath = Paths.get("src/main/java/pl/migibud/JavaIOzadania/ex1");
//        try {
//            Files.list(myPath)
//                    .forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File myFile = myPath.toFile();
        Arrays.stream(myFile.list()).forEach(System.out::println);

    }
}
