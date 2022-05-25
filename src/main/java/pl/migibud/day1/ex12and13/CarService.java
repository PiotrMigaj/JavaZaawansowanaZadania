package pl.migibud.day1.ex12and13;

import pl.migibud.day1.ex12and13.filteringcarsbyyearrealtion.FilterInRelationToYearStrategy;
import pl.migibud.day1.ex12and13.sortinglistofcars.FilterParameter;
import pl.migibud.day1.ex12and13.sortinglistofcars.SortingStrategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private final List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
    }

    public boolean addCar(Car car){
        if (car==null){
            return false;
        }
        carList.add(car);
        return true;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public boolean removeCarFromCarService(Car car){
        return carList.remove(car);
    }

    public List<Car> getAllCarsWithEngineV12(){
        return this.carList.stream()
                .filter(c->c.getEngine()==Engine.V12)
                .collect(Collectors.toList());
    }

    public List<Car> getAllCarsProducedBefore1999(){
        return this.carList.stream()
                .filter(c->c.getYearOfProduction()<1999)
                .collect(Collectors.toList());
    }

    public Car getTheMostExpensiveCar(){
        return this.carList.stream()
                .sorted((c1,c2)-> c2.getPrice()- c1.getPrice())
                .findFirst()
                .orElseThrow(()->new RuntimeException("There is no cars in car service"));
    }

    public Car getTheCheapestCar(){
        return this.carList.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .findFirst()
                .orElseThrow(()->new RuntimeException("There is no cars in car service"));
    }

    public List<Car> getListOfCarsWithAtLeast3Manufacturers(){
        return this.carList.stream()
                .filter(v->v.getManufacturerList().size()>=3)
                .collect(Collectors.toList());
    }

    public boolean ifCarOccursInCarService(Car car){
        return this.carList.contains(car);
    }

    public List<Car> getCarProducedByManufacturer(Manufacturer manufacturer){
        return this.carList.stream()
                .filter(c->c.getManufacturerList().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getSortedListOfCars(FilterParameter filterParameter){
        return SortingStrategy.sortCars(this.carList,filterParameter);
    }

    public List<Car> getFilteredCarProducedInRelationToYear(String relation, int year){
        return FilterInRelationToYearStrategy.filtering(this.carList,relation,year);
    }






}
