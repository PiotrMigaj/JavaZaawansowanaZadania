package pl.migibud.generics.animals;

public class Shark extends Animal {
    public Shark(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Shark: " + this.name + " is eating...");
    }


}
