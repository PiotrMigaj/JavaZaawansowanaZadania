package pl.migibud.day3.ex32;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@ToString
@AllArgsConstructor
public class Car implements Serializable {
    private String name;
    private String manufacturer;
    private int price;
}
