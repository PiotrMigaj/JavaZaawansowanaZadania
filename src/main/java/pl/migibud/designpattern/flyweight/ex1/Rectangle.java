package pl.migibud.designpattern.flyweight.ex1;

public class Rectangle implements Shape {

    private int x;
    private int y;
    private String color;

    public Rectangle(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle "+color+" x="+x+" y="+y);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
