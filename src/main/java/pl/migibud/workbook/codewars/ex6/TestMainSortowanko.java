package pl.migibud.workbook.codewars.ex6;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMainSortowanko {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Piotr","Ania","Basia"));
        List<String> role = new ArrayList<>(List.of("father","mother","daughter"));
        List<Integer> age = new ArrayList<>(List.of(30,28,1));

        role = getSortedListBasedOnAnotherList(names,String::compareTo,role);
        age = getSortedListBasedOnAnotherList(names,String::compareTo,age);
        names.sort(String::compareTo);
        System.out.println(names);
        System.out.println(role);
        System.out.println(age);


//        List<String> namesAfterSorting = names.stream().sorted().collect(Collectors.toList());
//        System.out.println(namesAfterSorting);


//        int[] namesNewOrder = new int[names.size()];
//
//        for (int i=0;i< namesNewOrder.length;i++){
//            String name = namesAfterSorting.get(i);
//            namesNewOrder[i] = names.indexOf(name);
//        }
//
//        System.out.println(Arrays.toString(namesNewOrder));
//
//        List<String> sortedRole = new ArrayList<>();
//
//        for (int i=0;i< namesNewOrder.length;i++){
//            sortedRole.add(role.get(namesNewOrder[i]));
//        }
//
//        System.out.println(sortedRole);
//
//        List<Integer> myMap = names.stream()
//                .collect(Collectors.toMap(Function.identity(),v->names.indexOf(v),(v1,v2)->v1,TreeMap::new))
//                .entrySet().stream()
//                .map(v->v.getValue())
//                .collect(Collectors.toList());
//
//        System.out.println(myMap);
//
//        Comparator<String> myNewComparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return myMap.get(role.indexOf(o2))- myMap.get(role.indexOf(o1));
//            }
//        };
//
//        System.out.println();
//        role.sort(myNewComparator);
//        System.out.println(role);
    }

    public static <T,U> List<U> getSortedListBasedOnAnotherList(List<T> inputPatternList,
                                                              Comparator<T> inputPatternListComp,
                                                              List<U> listToBeSorted){

        List<T> inputPatternListAfterSorting = inputPatternList.stream()
                .sorted(inputPatternListComp)
                .collect(Collectors.toList());
        int[] newIndexes = new int[inputPatternList.size()];
        for (int i=0;i< newIndexes.length;i++){
            T tmpT = inputPatternListAfterSorting.get(i);
            newIndexes[i] = inputPatternList.indexOf(tmpT);
        }
        List<U> listToBeSortedAfterSort = new ArrayList<>();
        for (int i=0;i< newIndexes.length;i++){
            listToBeSortedAfterSort.add(listToBeSorted.get(newIndexes[i]));
        }
        return listToBeSortedAfterSort;
    }
}
