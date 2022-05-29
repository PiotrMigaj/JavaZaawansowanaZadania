package pl.migibud.day2.ex28;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MyExtendedArrayListTest {

    @Test
    void shouldReturnSkippedArrayOfStrings(){
        //given
        MyExtendedArrayList<String> myExtendedArrayList = new MyExtendedArrayList<>();
        myExtendedArrayList.addAll(List.of("a","b","c","d","e","f","g","h","i","j","k","l"));
        //when
        List<String> result = myExtendedArrayList.getEveryNthElement(2,3);
        //then
        assertThat(result).containsExactly("c","g","k");
    }

    @Test
    void shouldReturnSkippedArrayOfIntegers(){
        //given
        MyExtendedArrayList<Integer> myExtendedArrayList = new MyExtendedArrayList<>();
        myExtendedArrayList.addAll(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13));
        //when
        List<Integer> result = myExtendedArrayList.getEveryNthElement(5,2);
        //then
        assertThat(result).containsExactly(6,9,12);
    }
}