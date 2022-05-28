package pl.migibud.day2.ex20and21and22sda;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cube implements Shape3D {

    private double a;

    @Override
    public double calculatePerimeter() {
        return 4*a;
    }

    @Override
    public double calculateVolume() {
        return this.calculateBaseArea()*a;
    }

    private double calculateBaseArea(){
        return a*a;
    }

    @Override
    public int fill(double volume) {
        double figureVolume = this.calculateVolume();
        if (figureVolume<volume){
            System.out.println("wleje za mało wody");
            return 1;
        }
        if (figureVolume>volume){
            System.out.println("wleje za dużo wody do figury i przeleje");
            return -1;
        }
        System.out.println("napełni figurę wodą po brzegi");
        return 0;
    }
}

class Main{
    public static void main(String[] args) {

        Cube cube = new Cube(6);
        double v = cube.doubleVolume(cube.calculateVolume(), 30);

        System.out.println(v);

    }
}
