package pl.migibud.solid.liskov;

public abstract class Vehicle implements Fuel{

    String type;
    int age;

    public Vehicle(String type, int age) {
        this.type = type;
        this.age = age;
    }

    void speedUp(){
        System.out.println("Vehicle is speeding up...");
    }

    void slowDown(){
        System.out.println("Vehicle is slowing down...");
    }

}
