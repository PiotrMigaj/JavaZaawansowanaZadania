package pl.migibud.day1.ex7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class WeaponMagazineTest {

    private WeaponMagazine weaponMagazine;

    @BeforeEach
    void initData(){
        weaponMagazine = new WeaponMagazine(5);
    }

    @Test
    void shouldBePossibleToAddBulletWhenMagazineIsNotFull(){
        //given

        //when
        weaponMagazine.loadBullet("pocisk_1");
        //then
        assertThat(weaponMagazine.isLoaded()).isTrue();
    }

    @Test
    void shouldReturnFalseIfMagazineIsEmpty(){
        //given

        //when
        boolean result = weaponMagazine.isLoaded();
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldBeNotPossibleToAddBulletWhenMagazineIsFull(){
        //given
        weaponMagazine.loadBullet("pocisk_1");
        weaponMagazine.loadBullet("pocisk_2");
        weaponMagazine.loadBullet("pocisk_3");
        weaponMagazine.loadBullet("pocisk_4");
        weaponMagazine.loadBullet("pocisk_5");

        //when
        assertThatThrownBy(()->weaponMagazine.loadBullet("pocisk_6")).isInstanceOf(IllegalArgumentException.class).hasMessage("pusty magazynek");
        assertThrows(IllegalArgumentException.class, ()->weaponMagazine.loadBullet("pocisk_6"));

    }

    @Test
    void shouldBePossibleToShotWhenMagazineIsNotEmpty(){
        //given
        weaponMagazine.loadBullet("pocisk_1");
        weaponMagazine.loadBullet("pocisk_2");
        weaponMagazine.loadBullet("pocisk_3");
        //when
        String result = weaponMagazine.shot();
        //then
        assertThat(result).isEqualTo("pocisk_3");
    }

    @Test
    void shouldNotBePossibleToShotWhenMagazineIsEmpty(){
        //given
        String expectedResult = "pusty magazynek";
        //when
        String result = weaponMagazine.shot();
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldNotBePossibleToShotWhenMagazineIsEmpty_2(){
        //given
        weaponMagazine.loadBullet("pocisk_1");
        weaponMagazine.loadBullet("pocisk_2");
        weaponMagazine.loadBullet("pocisk_3");
        //when
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        String result = weaponMagazine.shot();
        //then
        assertThat(result).isEqualTo("pusty magazynek");
    }
}