package pl.migibud.day3.ex30pmig;

import java.io.File;
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

        Path myPath = Paths.get("src/main/java/pl/migibud/day3/ex30pmig/pmig_test.txt");

        String[] fileName = myPath.getFileName().toString().split("\\.");
        System.out.println(Arrays.toString(fileName));
        String newFileNameWithoutExtension = new StringBuilder(fileName[0]).reverse().toString();
        System.out.println(newFileNameWithoutExtension);
        String newTotalName;
        if (fileName.length==1){
            newTotalName=newFileNameWithoutExtension;
        }else{
            newTotalName = newFileNameWithoutExtension+"."+fileName[1];
        }
        System.out.println(newTotalName);

        String myList = Files.readString(myPath);
        String anotherString = new StringBuilder(myList).reverse().toString();
        System.out.println(myList);

        String newPath = myPath.getParent().toString()+"/"+newTotalName;
        System.out.println(newPath);



//        Files.write(Paths.get(newPath),List.of(anotherString));

        FileWriter fw = new FileWriter(Paths.get(newPath).toFile());
        fw.write(anotherString);
        fw.close();


//        List<String> myContent = Files.readAllLines(myPath);
//
//        StringBuilder stringBuilder = new StringBuilder(myContent.stream().collect(Collectors.joining(" ")));
//        String[] outPut = stringBuilder.reverse().toString().split(" ");
//        List<String> myOutPutList = Arrays.asList(outPut);
//        System.out.println(Arrays.toString(outPut));
//
//        Files.write(Paths.get("src/main/java/pl/migibud/day3/ex31/text2.txt"),myOutPutList);

//        FileWriter fileWriter = new FileWriter("src/main/java/pl/migibud/day3/ex31/text3.txt");
//        fileWriter.append("Czesc piotr");
//        fileWriter.append("Czesc piotr");
//        fileWriter.close();









    }
}
