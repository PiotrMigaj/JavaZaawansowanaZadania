package pl.migibud.day1.ex5;

public class Main {
    public static void main(String[] args) {

        SDAHashSet<String> stringSDAHashSet = new SDAHashSet<>(10);

        System.out.println("Piotrek".hashCode());
        System.out.println(stringSDAHashSet.calculateHash("Piotrek"));

        stringSDAHashSet.add("Piotrek");




    }
}
