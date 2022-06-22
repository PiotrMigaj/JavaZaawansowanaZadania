package pl.migibud.SDAexercisesJavaAdvancedProgramming.ex6;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@ToString
public class MovableCircle implements Movable {

    private Movable movablePoint;
    private int radius;

    @Override
    public void moveUp() {
        this.movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        this.movablePoint.moveDown();
    }

    @Override
    public void moveLeft() {
        this.movablePoint.moveLeft();
    }

    @Override
    public void moveRight() {
        this.movablePoint.moveRight();
    }
}
