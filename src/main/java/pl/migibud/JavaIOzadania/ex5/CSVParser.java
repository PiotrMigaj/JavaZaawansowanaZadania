package pl.migibud.JavaIOzadania.ex5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CSVParser implements Parsable {

    @Override
    public User parseSingleLine(String input) {
        String[] inputData = input.split(",");
        int inputDataCounter = 0;
        String name = inputData[inputDataCounter++];
        String lastName = inputData[inputDataCounter++];
        int age = 0;
        try {
            age = Integer.parseInt(inputData[inputDataCounter++]);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        User user = new User(name,lastName,age);
        return user;
    }

    @Override
    public List<User> parseWholeFile(Path path) {
        List<String> inputListOfLines = readFile(path);
        return inputListOfLines.stream()
                .map(this::parseSingleLine)
                .collect(Collectors.toList());
    }

    private List<String> readFile(Path path){

        List<String> inputListOfLines = null;
        try {
            inputListOfLines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.copyOf(inputListOfLines);
    }


}
