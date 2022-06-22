package pl.migibud.SDAexercisesJavaAdvancedProgramming.ex7;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Circle implements GeometricObject,Resizable {

    @Getter
    private double radius;

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public void resize(int percent) {
        this.radius*=(1+percent/100d);
    }
}
