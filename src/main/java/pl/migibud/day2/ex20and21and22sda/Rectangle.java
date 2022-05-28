package pl.migibud.day2.ex20and21and22sda;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle implements Shape {

    private final double base;
    private final double height;

    @Override
    public double calculatePerimeter() {
        return 2 * base + 2 * height;
    }
}
