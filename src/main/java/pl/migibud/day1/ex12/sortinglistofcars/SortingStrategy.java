package pl.migibud.day1.ex12.sortinglistofcars;

import pl.migibud.day1.ex12.Car;

import java.util.List;
import java.util.NoSuchElementException;

public class SortingStrategy{

    private SortingStrategy(){}

    public static List<Car> sortCars(List<Car> inputList,FilterParameter filterParameter){

        switch (filterParameter){
            case PRICE_ASCENDING:
                return new SortPriceAscending().sort(inputList);
            case PRICE_DESCENDING:
                return new SortPriceDescending().sort(inputList);
            case YEAR_OF_PRODUCTION_ASCENDING:
                return new SortYearOfProductionAscending().sort(inputList);
            case YEAR_OF_PRODUCTION_DESCENDING:
                return new SortYearOfProductionDescending().sort(inputList);
            default:
                throw new NoSuchElementException("Wrong strategy");
        }
    }
}
