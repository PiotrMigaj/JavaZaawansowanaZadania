package pl.migibud.JavaIOzadania.ex3;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        Path myPath = Paths.get("src/main/java/pl/migibud/JavaIOzadania/ex3/test.txt");
        File myFile = myPath.toFile();


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(myFile,true))) {
            bw.append("\nto nowe teskt 2");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
