package pl.migibud.day3.ex33;

import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/pl/migibud/day3/ex33");
        List<String> result = ImageFinder.findImages(dirPath);
        System.out.println(result);
    }
}
