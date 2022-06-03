package pl.migibud.workbook.codewars.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String preSorting = "myjinxin2015;raulbc777;smile67;Dentzil;SteffenVogel_79\n"
                + "17945;10091;10088;3907;10132\n"
                + "2;12;13;48;11";
        String afterSorting = "Dentzil;myjinxin2015;raulbc777;smile67;SteffenVogel_79\n"
                + "3907;17945;10091;10088;10132\n"
                + "48;2;12;13;11";
        System.out.println(afterSorting.equals(sortCsvColumns(preSorting)));

    }

    public static String sortCsvColumns(String csvFileContent)
    {
        List<List<String>> inputSuperList = Arrays.stream(csvFileContent.split("\n"))
                .map(v->Arrays.stream(v.split(";")).collect(Collectors.toList()))
                .collect(Collectors.toList());


        List<String> headList = new ArrayList<>(inputSuperList.get(0));


        List<List<String>> outPutSuperList = new ArrayList<>();

        for (int i =0;i<inputSuperList.size();i++){
            List<String> tmpList =getSortedListBasedOnAnotherList(headList,String::compareToIgnoreCase,inputSuperList.get(i));
            outPutSuperList.add(tmpList);
        }

        String outputString = outPutSuperList.stream()
                .map(v->v.stream().collect(Collectors.joining(";")))
                .collect(Collectors.joining("\n"));

        return outputString;
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
