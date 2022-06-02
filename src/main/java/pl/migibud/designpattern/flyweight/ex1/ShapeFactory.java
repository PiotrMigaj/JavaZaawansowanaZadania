package pl.migibud.designpattern.flyweight.ex1;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    //we will create rectangle for every color
    Map<String, Shape> shapes;

    public ShapeFactory() {
        this.shapes = new HashMap<>();
    }

//    public Shape getShape(String color){
//        if(shapes.containsKey(color)){
//            return shapes.get(color);
//        }
//        Shape shape = new Rectangle(color);
//        shapes.put(color,shape);
//        return shape;
//    }

    public Shape getShapeByPMIG(String color){
        Shape rectangle = new Rectangle(color);
        Shape returnShape = shapes.putIfAbsent(color,rectangle);
        if (returnShape==null){
            return rectangle;
        }
        return returnShape;
    }
}
