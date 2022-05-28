package pl.migibud.day2.ex27;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JoinerTest {

    Car car1;
    Car car2;

    @BeforeEach
    void setUp(){
        car1 = new Car("Seat LEON",30_000);
        car2 = new Car("VW Golf",50_000);
    }

    @Test
    void shouldConcatCarToString(){
        //given
        String separator = " , ";
        Joiner<Car> carJoiner = new Joiner<>(separator);
        String expectedResult = String.join(separator,car1.toString(),car2.toString());
        //when
        String result = carJoiner.join(car1,car2);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }


}