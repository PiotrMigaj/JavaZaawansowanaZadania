package pl.migibud.day2.ex20and21and22sda;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle implements Shape {

    private final double a;
    private final double b;
    private final double c;

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }
}
