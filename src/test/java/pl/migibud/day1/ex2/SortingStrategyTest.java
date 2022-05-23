package pl.migibud.day1.ex2;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SortingStrategyTest {

    private static final List<String> INPUT_LIST = List.of("Asia","asia","Ala","Piotr","piotr","Zenon","wojtek","maria");


    @Test
    void shouldSortInReverseOrderDONTIgnoreCapitalLetter(){
        //given
        SortingStrategy strategy = new SortingStrategy(new SortStringsDONTIgnoreCapitalLetters());
        List<String> expectedResult = List.of("wojtek","piotr","maria","asia","Zenon","Piotr","Asia","Ala");
        //when
        List<String> actualResult = strategy.sortListOfStrings(INPUT_LIST);
        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void shouldSortInReverseOrderIgnoreCapitalLetter(){
        //given
        SortingStrategy strategy = new SortingStrategy(new SortStringsIgnoreCapitalLetters());
        List<String> expectedResult = List.of("Zenon","wojtek","Piotr","piotr","maria","Asia","asia","Ala");
        //when
        List<String> actualResult = strategy.sortListOfStrings(INPUT_LIST);
        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }


}