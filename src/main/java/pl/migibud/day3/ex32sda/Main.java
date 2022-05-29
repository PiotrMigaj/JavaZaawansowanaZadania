package pl.migibud.day3.ex32sda;

import java.io.*;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Path dirPath = Path.of("src/main/java/pl/migibud/day3/ex32sda");
        Path inputFile = dirPath.resolve("cars.migicar");

        List<Car> cars = List.of(new Car("xc90", "Volvo", 300_000),
                new Car("Leon", "Seat", 60_000),
                new Car("Golf", "VW", 60_000));
//        saveCar(inputFile, cars);
        List<Car> result = load(inputFile);
        System.out.println(result);
    }

    private static void saveCar(Path inputFile, List<Car> content) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(inputFile.toFile()))) {
            oos.writeObject(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Car> load(Path file){

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file.toFile()))){
            return  (List<Car>) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }


}
