package pl.migibud.day3.ex29;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningUtil {

    public static <T> int getPercentageValuesThatFulfilSpecification(T[] inputArray, Predicate<T> specificationFunction){
        List<T> myFilteredList = Arrays.stream(inputArray)
                .filter(specificationFunction::test)
                .collect(Collectors.toList());
        double percentage = ((double)(myFilteredList.size())/Arrays.asList(inputArray).size())*100;
        return (int)Math.round(percentage);
    }

}
