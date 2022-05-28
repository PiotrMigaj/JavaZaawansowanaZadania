package pl.migibud.day2.ex20and21and22sda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CubeTest {

    Cube cube;

    @BeforeEach
    void setUp(){
        cube = new Cube(6);
    }


    @Test
    void shouldReturnVolumeOfCube(){
        //given
        double expectedResult = 6*6*6;
        //when
        double result = cube.calculateVolume();
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}