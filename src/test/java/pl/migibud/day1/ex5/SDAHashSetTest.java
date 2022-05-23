package pl.migibud.day1.ex5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SDAHashSetTest {

    private SDAHashSet<Person> sdaHashSet;

    @BeforeEach
    void setUp(){
        sdaHashSet = new SDAHashSet<>();
    }

    @Test
    void shouldAddElementToHashSet(){
        //given
        Person person = new Person("Piotr",24);
        //when
        sdaHashSet.add(person);
        //then
        assertThat(sdaHashSet.contains(person)).isTrue();
        assertThat(sdaHashSet.size()).isEqualTo(1);
    }

    @Test
    void shouldNotAddElementToHashSetIfStored(){
        //given
        Person person = new Person("Piotr",24);
        Person person2 = new Person("Piotr",24);
        Person person3 = new Person("Ania",21);
        //when
        sdaHashSet.add(person);
        boolean result =  sdaHashSet.add(person2);
        sdaHashSet.add(person3);
        //then
        assertThat(sdaHashSet.contains(person)).isTrue();
        assertThat(sdaHashSet.size()).isEqualTo(2);
        assertThat(result).isFalse();
    }

    @Test
    void shouldRemoveElementFromHashSetIfStored(){
        //given
        Person person = new Person("Piotr",24);
        Person person2 = new Person("Piotr",24);
        Person person3 = new Person("Ania",21);
        sdaHashSet.add(person);
        sdaHashSet.add(person2);
        sdaHashSet.add(person3);
        //when
        boolean result = sdaHashSet.remove(person);
        //then
        assertThat(sdaHashSet.contains(person)).isFalse();
        assertThat(sdaHashSet.size()).isEqualTo(1);
        assertThat(result).isTrue();
    }

    @Test
    void shouldNotRemoveElementFromHashSetIfNotStored(){
        //given
        Person person = new Person("Piotr",24);
        Person person2 = new Person("Piotr",24);
        Person person3 = new Person("Ania",21);
        sdaHashSet.add(person);
        sdaHashSet.add(person2);
        sdaHashSet.add(person3);
        sdaHashSet.remove(person);
        //when
        boolean result = sdaHashSet.remove(person2);
        //then
        assertThat(sdaHashSet.contains(person)).isFalse();
        assertThat(sdaHashSet.size()).isEqualTo(1);
        assertThat(result).isFalse();
    }

    @Test
    void shouldRemoveAllElementFromHashSet(){
        //given
        Person person = new Person("Piotr",24);
        Person person2 = new Person("Piotr",24);
        Person person3 = new Person("Ania",21);
        sdaHashSet.add(person);
        sdaHashSet.add(person2);
        sdaHashSet.add(person3);
        //when
        sdaHashSet.clear();
        //then
        assertThat(sdaHashSet.contains(person)).isFalse();
        assertThat(sdaHashSet.contains(person2)).isFalse();
        assertThat(sdaHashSet.contains(person3)).isFalse();
        assertThat(sdaHashSet.size()).isEqualTo(0);
    }


}