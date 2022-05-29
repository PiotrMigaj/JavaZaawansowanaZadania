package pl.migibud.day3.ex32;

import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ToString
public class CarService implements Serializable {

    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    public void add(Car car){
        cars.add(car);
    }
}
