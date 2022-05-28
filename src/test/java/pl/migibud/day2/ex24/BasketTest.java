package pl.migibud.day2.ex24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.migibud.day2.ex24.exceptions.BasketFullException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    private Basket basket;

    @BeforeEach
    void setUp(){
        basket = new Basket();
    }

    @Test
    void shouldNotBePossibleToAddNewItemWhenBasketIsFull(){
        //given
        initData();
        //when
        //then
        assertThatThrownBy(()->basket.add()).isInstanceOf(BasketFullException.class);
    }

    private void initData(){
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
    }

}