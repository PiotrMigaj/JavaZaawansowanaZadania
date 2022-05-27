package pl.migibud.workbook.generics;

import javax.lang.model.type.MirroredTypeException;

public class App {
    public static void main(String[] args) {

        Library<Algorithm> algorithmLibrary = new Library<>();
        algorithmLibrary.add(new SearchAlgorithm());
        algorithmLibrary.add(new SortingAlgorithm());
        algorithmLibrary.add(new GraphAlgorithm());

        Algorithm last = algorithmLibrary.getLast();


        while (last!=null){
            last.execute();
            last = algorithmLibrary.getLast();
        }

    }
}
