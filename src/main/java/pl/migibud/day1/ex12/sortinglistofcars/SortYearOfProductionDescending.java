package pl.migibud.day1.ex12.sortinglistofcars;

import pl.migibud.day1.ex12.Car;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class SortYearOfProductionDescending implements Sortable{

    @Override
    public List<Car> sort(List<Car> inputList) {
        return inputList.stream()
                .sorted((c1,c2)-> c2.getYearOfProduction()- c1.getYearOfProduction())
                .collect(Collectors.toList());
    }
}
