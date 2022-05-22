package pl.migibud.day1.ex1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Day1Ex1Test {

    private final static List<String> UNSORTED = List.of("A","B","C","D");
    private final static List<String> SORTED = List.of("D","C","B","A");



    @Test
    void sortUsingMyOwnComparatorClass() {
        //given
        //when
        List<String> result = Day1Ex1.sortUsingMyOwnComparatorClass(UNSORTED);
        //then
        assertThat(result).isEqualTo(SORTED);

    }

    @Test
    void sortUsingStream() {
        //given
        //when
        List<String> result = Day1Ex1.sortUsingStream(UNSORTED);
        //then
        assertThat(result).isEqualTo(SORTED);

    }
}