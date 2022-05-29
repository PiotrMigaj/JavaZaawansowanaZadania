package pl.migibud.day3.ex30;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Task30 {

    public static void main(String[] args) {

        Path dirPath = Path.of("src/main/java/pl/migibud/day3/ex30");
        Path inputFile = dirPath.resolve("course.txt");

        if(!inputFile.toFile().exists()){
            System.out.println("File not exist!");
        }

        List<String> content = null;

        try {
            content = getFileContent(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> strings = reverseFileContents(content);

        Path outputFile = reversedInputFile(inputFile);
        System.out.println(outputFile);

        try {
            saveFile(outputFile,strings);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static List<String> getFileContent(Path inputFile) throws IOException {
        return Files.readAllLines(inputFile);
    }

    private static List<String> reverseFileContents(List<String> content){
        return content.stream()
                .map(v->new StringBuilder(v).reverse().toString())
                .collect(Collectors.toList());
    }

    private static Path reversedInputFile(Path inputFile){
        String nameOfFile = inputFile.toFile().getName();
        String fileExtension = "";
        int index = nameOfFile.indexOf(".");
        if (index>0){ // jeżeli index wiekszy od zera to mamy rozszerzenie pliku
            fileExtension = nameOfFile.substring(index); // .txt
            nameOfFile = nameOfFile.substring(0,index);
        }
        String outputName = new StringBuilder(nameOfFile)
                .reverse()
                .append(fileExtension)
                .toString();
        return inputFile.getParent().resolve(outputName);
    }

    private static void saveFile(Path outputFile, List<String> content) throws IOException {
        Files.write(outputFile,content);
    }

}
