package pl.migibud.day1.ex12and13.sortinglistofcars;

import pl.migibud.day1.ex12and13.Car;

import java.util.List;
import java.util.stream.Collectors;

class SortPriceDescending implements Sortable{

    @Override
    public List<Car> sort(List<Car> inputList) {
        return inputList.stream()
                .sorted((c1,c2)-> c2.getPrice()- c1.getPrice())
                .collect(Collectors.toList());
    }
}
