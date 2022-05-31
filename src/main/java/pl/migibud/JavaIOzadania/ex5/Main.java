package pl.migibud.JavaIOzadania.ex5;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parsable csvParser = new CSVParser();
        Path path = Paths.get("src/main/java/pl/migibud/JavaIOzadania/ex5/csv_test.csv");
        List<User> userList = csvParser.parseWholeFile(path);
        System.out.println(userList);

    }
}
