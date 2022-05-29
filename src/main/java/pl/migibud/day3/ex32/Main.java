package pl.migibud.day3.ex32;

import java.io.*;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CarService carService = new CarService();
        carService.add(new Car("Leon","Seat",30_000));
        carService.add(new Car("Golf","VW",60_000));
        carService.add(new Car("Punto","Fiat",10_000));

        OutputStream outputStream = new FileOutputStream("src/main/java/pl/migibud/day3/ex32/carservice.migicar");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(carService);
        objectOutputStream.close();

        InputStream inputStream = new FileInputStream("src/main/java/pl/migibud/day3/ex32/carservice.migicar");

        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        CarService carService1 = (CarService) objectInputStream.readObject();
        carService1.add(new Car("Passat","VW",150_000));
        System.out.println(carService);
        System.out.println();
        System.out.println(carService1);


    }



}
