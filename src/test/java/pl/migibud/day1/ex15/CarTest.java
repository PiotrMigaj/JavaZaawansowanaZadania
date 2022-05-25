package pl.migibud.day1.ex15;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void isCarPremium(){
        //given
        //when
        //then
        assertThat(Car.BMW.isPremium()).isTrue();
        assertThat(Car.BMW.isRegular()).isFalse();
    }

    @Test
    void isCarNotPremium(){
        //given
        //when
        //then
        assertThat(Car.FIAT.isPremium()).isFalse();
        assertThat(Car.BMW.isPremium()).isTrue();
    }

    @Test
    void isCarFaster(){
        //given
        //when
        //then
        assertThat(Car.BMW.isFasterThan(Car.FIAT)).isTrue();
        assertThat(Car.FIAT.isFasterThan(Car.BMW)).isFalse();

    }


}