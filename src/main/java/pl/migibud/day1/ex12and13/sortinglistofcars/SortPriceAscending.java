package pl.migibud.day1.ex12and13.sortinglistofcars;

import pl.migibud.day1.ex12and13.Car;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class SortPriceAscending implements Sortable{

    @Override
    public List<Car> sort(List<Car> inputList) {
        return inputList.stream()
                .sorted(Comparator.comparingInt(Car::getPrice))
                .collect(Collectors.toList());
    }
}
