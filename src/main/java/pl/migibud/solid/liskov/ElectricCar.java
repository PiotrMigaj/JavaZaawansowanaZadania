package pl.migibud.solid.liskov;

public class ElectricCar extends Vehicle{

    public ElectricCar(String type, int age) {
        super(type, age);
    }

    @Override
    void speedUp(){
        System.out.println("Electric car is speeding up...");
    }

    @Override
    void slowDown(){
        System.out.println("Electric car is slowing down...");
    }

    @Override
    public void fuel(){
        System.out.println("Electric car if chargerd");
    }
}
