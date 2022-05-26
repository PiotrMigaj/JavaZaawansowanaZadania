package pl.migibud.designpattern.chainofresponsibility.ex1;

import java.util.Arrays;
import java.util.List;

public class ProgrammertHelper extends Helper{

    private static final List<String> LIST_OF_ERRORS = List.of(
        "Exception","Error","OutOfMemory"
    );

    @Override
    public void handle(String request) {
        if(Arrays.stream(request.split(" ")).anyMatch(LIST_OF_ERRORS::contains)){
            System.out.println("Odsyłamy zapytanie do programisty");
        }else{
            System.out.println("Żądanie nie może być obsłużone, prosimy o kontakt z działem obsługi klienta");
        }
    }
}
