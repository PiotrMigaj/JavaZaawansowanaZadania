package pl.migibud.day1.ex12;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Getter
@ToString
@Builder
public class Car {

    private String name;
    private int price;
    private int yearOfProduction;
    private List<Manufacturer> manufacturerList;
    private Engine engine;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && yearOfProduction == car.yearOfProduction && Objects.equals(name, car.name) && Objects.equals(manufacturerList, car.manufacturerList) && engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, yearOfProduction, manufacturerList, engine);
    }
}
