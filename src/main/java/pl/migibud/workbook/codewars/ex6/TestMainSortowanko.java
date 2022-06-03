package pl.migibud.workbook.codewars.ex6;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMainSortowanko {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Piotr","Ania","Basia"));
        List<String> role = new ArrayList<>(List.of("father","mother","daughter"));

        List<String> namesAfterSorting = names.stream().sorted().collect(Collectors.toList());
        System.out.println(namesAfterSorting);


        int[] namesNewOrder = new int[names.size()];

        for (int i=0;i< namesNewOrder.length;i++){
            String name = namesAfterSorting.get(i);
            namesNewOrder[i] = names.indexOf(name);
        }

        System.out.println(Arrays.toString(namesNewOrder));

        List<String> sortedRole = new ArrayList<>();

        for (int i=0;i< namesNewOrder.length;i++){
            sortedRole.add(role.get(namesNewOrder[i]));
        }

        System.out.println(sortedRole);



//        System.out.println(names);
//
//        Map<String,Integer> familyNames = new HashMap<>();
//        for (int i=0;i<names.size();i++){
//            String name = names.get(i);
//            familyNames.put(name,i);
//        }
//
//        System.out.println(familyNames);
//
//        role.sort(new NamesComparator(familyNames));
//        System.out.println(role);






    }
}
