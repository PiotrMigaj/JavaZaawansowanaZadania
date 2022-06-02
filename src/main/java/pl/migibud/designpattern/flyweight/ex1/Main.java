package pl.migibud.designpattern.flyweight.ex1;

public class Main {
    public static void main(String[] args) {
//        ShapeFactory shapeFactory = new ShapeFactory();
//        Shape rectangle = shapeFactory.getShapeByPMIG("red");
//        Shape rectangle2 = shapeFactory.getShapeByPMIG("red");
//        System.out.println(shapeFactory.shapes);
//        System.out.println(rectangle==rectangle2);

        FlyweightSimulator simulator = new FlyweightSimulator();
        simulator.run();

    }
}
