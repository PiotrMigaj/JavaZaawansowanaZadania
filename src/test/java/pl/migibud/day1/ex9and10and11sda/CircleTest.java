package pl.migibud.day1.ex9and10and11sda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.within;

class CircleTest {

    private Circle circle;

    @BeforeEach
    void init(){
        circle = new Circle(new Point2D(1,2),new Point2D(3,0));
    }

    @Test
    void shouldReturnCorrectRadius(){
        //when
        double result = circle.getRadius();
        //then
        assertThat(result).isCloseTo(2.82,within(0.01));
    }

    @Test
    void shouldReturnCorrectPerimeter(){
        //when
        double result = circle.getPerimeter();
        //then
        assertThat(result).isCloseTo(17.7,within(0.1));
    }

    @Test
    void shouldReturnCorrectArea(){
        //when
        double result = circle.getArea();
        //then
        assertThat(result).isCloseTo(25.1,within(0.1));
    }

    @Test
    void shouldReturnCorrectCoordinatesAfterMoving(){
        //given
        Point2D point2D = new Point2D(0,0);
        //when
        point2D.move(new MoveDirection(3,3));
        Point2D expectedResult = new Point2D(3,3);
        //then
        assertThat(point2D).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnCorrectRadiusAfterMoving(){
        //given
        //when
        circle.move(new MoveDirection(3,3));
        double result = circle.getRadius();
        //then
        assertThat(result).isCloseTo(2.82,within(0.01));
    }

    @Test
    void shouldReturnCorrectPerimeterAfterMoving(){
        //then
        //when
        circle.move(new MoveDirection(3,3));
        double result = circle.getPerimeter();
        //then
        assertThat(result).isCloseTo(17.7,within(0.1));
    }

    @Test
    void shouldReturnCorrectAreaAfterMoving(){
        //when
        circle.move(new MoveDirection(3,3));
        double result = circle.getArea();
        //then
        assertThat(result).isCloseTo(25.1,within(0.1));
    }
    @Test
    void shouldReturnCorrectRadiusAfterResize(){
        //given
        //when
        circle.resize(1.5);
        double result = circle.getRadius();
        //then
        assertThat(result).isCloseTo(4.24,within(0.01));
    }

    @Test
    void shouldReturnCorrectPerimeterAfterResize(){
        //then
        //when
        circle.resize(1.5);
        double result = circle.getPerimeter();
        //then
        assertThat(result).isCloseTo(26.6,within(0.1));
    }

    @Test
    void shouldReturnCorrectAreaAfterResize(){
        //when
        circle.resize(1.5);
        double result = circle.getArea();
        //then
        assertThat(result).isCloseTo(56.5,within(0.1));
    }
}