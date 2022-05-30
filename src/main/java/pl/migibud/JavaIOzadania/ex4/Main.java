package pl.migibud.JavaIOzadania.ex4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Path myPath = Paths.get("src/main/java/pl/migibud/JavaIOzadania/ex4/test.txt");

        //        File file = myPath.toFile();
//
//        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
//            String input = null;
//            while ((input=br.readLine())!=null){
//                System.out.println(input);
//            };
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        List<String> myList = null;

        try {
            myList = Files.readAllLines(myPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String longestOne = myList.stream()
                .flatMap(v -> Arrays.stream(v.split(" ")))
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst()
                .get();

        System.out.println(longestOne);


    }

}
