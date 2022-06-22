package pl.migibud.SDAexercisesJavaAdvancedProgramming.ex6;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@ToString
public class MovablePoint implements Movable {

    private int x,y;
    private int xSpeed,ySpeed;

    @Override
    public void moveUp() {
        this.x+=this.xSpeed;
    }

    @Override
    public void moveDown() {
        this.x-=this.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.y-=this.ySpeed;
    }

    @Override
    public void moveRight() {
        this.y+=this.ySpeed;
    }
}
