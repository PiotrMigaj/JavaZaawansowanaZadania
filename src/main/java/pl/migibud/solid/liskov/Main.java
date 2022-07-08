package pl.migibud.solid.liskov;

public class Main {
    public static void main(String[] args) {

        Vehicle v = new ElectricCar("Ford",6);
        v.speedUp();
        v.slowDown();
        v.fuel();

    }
}
