package pl.migibud.JavaIOzadania.ex3sda;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";
        try {
            String filename = "src/main/java/pl/migibud/JavaIOzadania/ex3sda/test.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write("Java I/0 Exercises\n");
            fw.close();
            BufferedReader br = new BufferedReader(new
                    FileReader(filename));
            while (strLine != null) {
                stringBuilder.append(strLine);
                stringBuilder.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        } catch (IOException ioe) {
            System.err.println("I0Exception: " + ioe.getMessage());
        }
    }

}
