package pl.migibud.SDAexercisesJavaAdvancedProgramming.ex7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private GeometricObject geometricObject;

    @BeforeEach
    void setUp(){
        geometricObject = new Circle(3.25);
    }

    @Test
    void shouldReturnCorrectPerimeterOfCircle(){
        //given
        double expectedResult = 20.42;
        //when
        double result = geometricObject.getPerimeter();
        //then
        assertThat(result).isCloseTo(expectedResult,offset(0.01));
    }

}