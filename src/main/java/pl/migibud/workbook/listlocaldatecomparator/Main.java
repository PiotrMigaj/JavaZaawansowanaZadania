package pl.migibud.workbook.listlocaldatecomparator;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<LocalDate> localDateList = List.of(LocalDate.of(2022,1,1),LocalDate.of(1999,1,3));

        System.out.println(localDateList.stream().sorted().collect(Collectors.toList()));


    }
}
