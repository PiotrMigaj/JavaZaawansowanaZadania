package pl.migibud.generics.animals;

public class Main {
    public static void main(String[] args) {

        Enclosure<Animal> animalEnclosure = new Enclosure<>();
        animalEnclosure.addAnimalToEnclosure(new Shark("Piotr"));
        System.out.println(animalEnclosure.getListOfAnimals());

        Enclosure<Shark> sharkEnclosure = new ModerEnclosure<>();












    }
}
