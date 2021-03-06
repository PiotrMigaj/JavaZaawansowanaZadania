package pl.migibud.day1.ex9and10and11sda;

import java.util.Objects;

public class Point2D implements Movable{

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D point2D = (Point2D) o;
        return Double.compare(point2D.x, x) == 0 && Double.compare(point2D.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


    @Override
    public boolean move(MoveDirection moveDirection) {
        if (moveDirection==null){
            return false;
        }
        this.x += moveDirection.getX();
        this.y += moveDirection.getY();
        return true;
    }
}
