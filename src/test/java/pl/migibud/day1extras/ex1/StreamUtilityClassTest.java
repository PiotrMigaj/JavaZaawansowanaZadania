package pl.migibud.day1extras.ex1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StreamUtilityClassTest {

    @Test
    void shouldReturnListOfStringsStartsWithLowerAAndHasLengthEquals3(){
        //given
        List<String> input = List.of("cat","piotr","Cat","cii","Cecylia");
        //when
        List<String> result = StreamUtilityClass.search(input);
        //then
        assertThat(result).containsExactly("cat","cii");
    }

    @Test
    void shouldReturnStringMadeOfIntegerList(){
        //given
        List<Integer> input = List.of(1, 2, 30, 29);
        String expectedResult = "o1,e2,e30,o29";
        //when
        String result = StreamUtilityClass.getString(input);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}