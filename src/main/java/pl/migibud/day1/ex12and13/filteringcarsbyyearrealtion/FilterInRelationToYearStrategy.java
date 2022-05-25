package pl.migibud.day1.ex12and13.filteringcarsbyyearrealtion;

import pl.migibud.day1.ex12and13.Car;

import java.util.List;
import java.util.stream.Collectors;

public class FilterInRelationToYearStrategy {

    public static List<Car> filtering(List<Car> inputList, String relation,int year){
        switch (relation){
            case "<":
                return inputList.stream()
                        .filter(v->v.getYearOfProduction()<year)
                        .collect(Collectors.toList());
            default:
                throw new RuntimeException("Wrong realtion operator");
        }
    }

}
