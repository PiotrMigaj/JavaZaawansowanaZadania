package pl.migibud.generics.animals;

import java.util.ArrayList;
import java.util.List;

public class Enclosure<T extends Animal> {

    List<? super Animal> listOfAnimals;

    public Enclosure() {
        this.listOfAnimals = new ArrayList<>();
    }

    public void addAnimalToEnclosure(T t){
        this.listOfAnimals.add(t);
    }

    public List<? super Animal> getListOfAnimals() {
        return listOfAnimals;
    }

    public void setListOfAnimals(List<? super Animal> listOfAnimals) {
        this.listOfAnimals = listOfAnimals;
    }
}
