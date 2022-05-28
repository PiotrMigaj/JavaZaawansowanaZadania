package pl.migibud.day1.ex16;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class RunnerTest {

    @Test
    void shouldReturnAdvancedRunner(){
        //given
        int timeOfMarathon = 260;
        //when
        Runner result = Runner.getFitnessLevel(timeOfMarathon);
        //then
        assertThat(result).isEqualTo(Runner.ADVANCED);
    }

    @Test
    void shouldReturnIntermediateRunner(){
        //given
        int timeOfMarathon = 330;
        //when
        Runner result = Runner.getFitnessLevel(timeOfMarathon);
        //then
        assertThat(result).isEqualTo(Runner.INTERMEDIATE);
    }

    @Test
    void shouldReturnBeginnerRunner(){
        //given
        int timeOfMarathon = 370;
        //when
        Runner result = Runner.getFitnessLevel(timeOfMarathon);
        //then
        assertThat(result).isEqualTo(Runner.BEGINNER);
    }

    @Test
    void shouldThrowExceptionIfTimeIsOutOfBounds(){
        //given
        int timeOfMarathon = 450;
        //when
        //then
        assertThatThrownBy(()->Runner.getFitnessLevel(timeOfMarathon)).isInstanceOf(RuntimeException.class);
    }
}