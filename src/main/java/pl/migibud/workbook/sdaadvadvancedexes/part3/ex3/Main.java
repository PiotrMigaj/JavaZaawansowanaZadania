package pl.migibud.workbook.sdaadvadvancedexes.part3.ex3;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("seat leon",CarType.LUXURY);
        System.out.println(car);

        Car.Engine engine = car.getEngine();

//        Car.Engine engine = car.new Engine();
//        engine.setEngineType();
//
//
//        System.out.println(engine);



    }
}
