package pl.migibud.day1.ex15;

import java.util.Collections;
import java.util.Comparator;

public enum Car {
    FERRARI(350_000,350,true),
    PORSCHE(300_000,330,true),
    MERCEDES(250_000,300,true),
    BMW(200_000,250,true),
    OPEL(100_000,160,false),
    FIAT(60_000,140,false),
    TOYOTA(110_000,170,false);

    private int price;
    private int maxSpeed;
    private boolean isPremium;

    Car(int price, int maxSpeed, boolean isPremium){
        this.price=price;
        this.maxSpeed = maxSpeed;
        this.isPremium=isPremium;
    }

    boolean isPremium(){
        return this.isPremium;
    }

    boolean isRegular(){
        return !this.isPremium;
    }

    boolean isFasterThan(Car car){
        int compare = this.compareTo(car);
        if (compare>0){
            return false;
        }
        if (compare<0){
            return true;
        }
        return false;
    }





}
