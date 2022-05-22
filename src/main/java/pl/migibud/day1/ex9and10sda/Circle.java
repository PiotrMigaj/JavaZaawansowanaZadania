package pl.migibud.day1.ex9and10sda;

import java.util.Objects;

public class Circle implements Movable{

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius(){
        return Math.sqrt(Math.pow(center.getX()- point.getX(),2 )+Math.pow(center.getY()- point.getY(),2));
    }

    public double getPerimeter(){
        return 2*Math.PI*this.getRadius();
    }

    public double getArea(){
        return Math.PI*Math.pow(this.getRadius(),2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(center, circle.center) && Objects.equals(point, circle.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, point);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        center.move(moveDirection);
    }
}
