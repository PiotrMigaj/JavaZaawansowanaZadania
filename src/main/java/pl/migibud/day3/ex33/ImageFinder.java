package pl.migibud.day3.ex33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImageFinder {

    public static List<String> findImages(Path directory){
        //założenie plik ze zdjęciem, to plik z roszerzeniem *.png lub *.jpg
        try (Stream<Path> walk = Files.walk(directory)){
            return walk
                    .map(v->v.getFileName().toString())
                    .filter(v->v.matches("\\w+\\.(JPG|jpg|png|PNG)"))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

}
