package pl.migibud.day2.ex20and21and22sda;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ShapeTest {

    @Test
    void shouldCalculatePerimeterForRectangle(){
        //given
        Shape rectangle = new Rectangle(2,4);
        //when
        double result = rectangle.calculatePerimeter();
        //then
        assertThat(result).isEqualTo(12);
    }

    @Test
    void shouldCalculatePerimeterForTriangle(){
        //given
        Shape triangle = new Triangle(2,4,3);
        //when
        double result = triangle.calculatePerimeter();
        //then
        assertThat(result).isEqualTo(9);
    }

    @Test
    void shouldCalculatePerimeterForHexagon(){
        //given
        Shape hexagon = new Hexagon(6);
        //when
        double result = hexagon.calculatePerimeter();
        //then
        assertThat(result).isEqualTo(36);
    }

}