package pl.migibud.day1.ex12.sortinglistofcars;

import pl.migibud.day1.ex12.Car;

import java.util.List;

public interface Sortable {
    List<Car> sort(List<Car> inputList);
}
