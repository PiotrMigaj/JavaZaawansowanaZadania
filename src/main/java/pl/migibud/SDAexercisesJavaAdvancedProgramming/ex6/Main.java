package pl.migibud.SDAexercisesJavaAdvancedProgramming.ex6;

public class Main {
    public static void main(String[] args) {

        Movable mP = new MovablePoint(0,0,1,2);
        Movable mC = new MovableCircle(mP,1);

        System.out.println(mC);
        mC.moveDown();

        System.out.println(mP);


    }
}
