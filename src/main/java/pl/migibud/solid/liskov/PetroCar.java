package pl.migibud.solid.liskov;

public class PetroCar extends Vehicle{

    public PetroCar(String type, int age) {
        super(type, age);
    }

    @Override
    void speedUp(){
        System.out.println("Car is speeding up...");
    }

    @Override
    void slowDown(){
        System.out.println("Car is slowing down...");
    }

    @Override
    public void fuel(){
        System.out.println("Car fuel method...");
    }
}
