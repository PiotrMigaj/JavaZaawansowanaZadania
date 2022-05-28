package pl.migibud.day2.ex20and21and22sda;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Hexagon implements Shape {

    private final double s;

    @Override
    public double calculatePerimeter() {
        return 6*s;
    }
}
