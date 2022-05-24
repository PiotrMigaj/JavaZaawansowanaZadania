package pl.migibud.day1extras.ex2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        ITCompany itCompany = new ITCompany();
        Programmer programmer1 = new Programmer(new Person("Piotr","Migaj",30,Gender.MALE), List.of("C#","Java","Python"));
        Programmer programmer2 = new Programmer(new Person("Anna","Migaj",30,Gender.FEMALE), List.of("C#","Java","Python"));
        Programmer programmer3 = new Programmer(new Person("Jan","Kowalski",40,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer4 = new Programmer(new Person("Jan","Umber",17,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer5 = new Programmer(new Person("Anna","Umber",17,Gender.FEMALE), List.of("Pascal","Python","Java"));
        Programmer programmer6 = new Programmer(new Person("Maria","Umber",16,Gender.FEMALE), List.of("c#","Python","JAVA"));
        Programmer programmer7 = new Programmer(new Person("Maria","Umber",16,Gender.FEMALE), List.of("Java","c#"));
        Programmer programmer8 = new Programmer(new Person("Kasia","Fiołek",16,Gender.FEMALE), List.of());
        itCompany.addProgrammerToCompany(programmer1);
        itCompany.addProgrammerToCompany(programmer2);
        itCompany.addProgrammerToCompany(programmer3);
        itCompany.addProgrammerToCompany(programmer4);
        itCompany.addProgrammerToCompany(programmer5);
        itCompany.addProgrammerToCompany(programmer6);
        itCompany.addProgrammerToCompany(programmer7);
        itCompany.addProgrammerToCompany(programmer8);

        System.out.println(itCompany.getNumbersAllLanguagesKnownByFemaleProgrammers());
    }
}
