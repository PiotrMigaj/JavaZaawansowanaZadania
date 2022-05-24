package pl.migibud.day1.ex6;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldReturnFirstAndLastEntrySetFromTreeMap(){
        //given
        TreeMap<String,Integer> myMap = new TreeMap<>();
        myMap.put("Piotr",30);
        myMap.put("Ania",28);
        myMap.put("Basia",1);
        myMap.put("Iwona",60);
        //when
        //then
        Main.printFirstAndLastEntrySetOfMap(myMap);

    }

}