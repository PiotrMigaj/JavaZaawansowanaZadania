package pl.migibud.day2.ex27;

public class Main {

    public static void main(String[] args) {

        String separator = " , ";
        Joiner<Car> myJoiner = new Joiner<>(separator);

        String myJoinedString = myJoiner.join(new Car("Seat LEON",30_000), new Car("VW Golf",50_000));
        System.out.println(myJoinedString);

        JoinerWithStaticMethod joinerWithStaticMethod = new JoinerWithStaticMethod(separator);
        String join = joinerWithStaticMethod.join(new Car("Seat LEON", 30_000), new Car("VW Golf", 50_000));
        System.out.println(join);


    }

}
