package pl.migibud.generics.animals;

public class Elephant extends Animal {

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Elephant: " + this.name + " is eating...");
    }
}
