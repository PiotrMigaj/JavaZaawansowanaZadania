package pl.migibud.day1.ex4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StorageTest {



    @Test
    void addToStorage() {
        //given
        Storage storage = new Storage();
        storage.addToStorage("VW","Golf");
        storage.addToStorage("VW","Passat");
        //when
        int actualSize = 2;
        //then
        assertThat(storage.getValues("VW").size()).isEqualTo(2);
    }

    @Test
    void printValues() {
        //given
        Storage storage = new Storage();
        storage.addToStorage("VW","Golf");
        storage.addToStorage("VW","Passat");
        //when
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Golf");
        expectedResult.add("Passat");
        //then
        assertThat(storage.getValues("VW")).isEqualTo(expectedResult);



    }

    @Test
    void getAllKeysOfSpecifiedValue() {
        //given
        Storage storage = new Storage();
        storage.addToStorage("VW","Golf");
        storage.addToStorage("VW","Passat");
        storage.addToStorage("Seat","Passat");
        //when
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("VW");
        expectedResult.add("Seat");
        //then
        System.out.println(storage.getAllKeysOfSpecifiedValue("Passat"));
        assertThat(storage.getAllKeysOfSpecifiedValue("Passat")).isEqualTo(expectedResult);
    }
}