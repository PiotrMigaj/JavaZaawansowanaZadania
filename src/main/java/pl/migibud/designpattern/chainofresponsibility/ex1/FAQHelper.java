package pl.migibud.designpattern.chainofresponsibility.ex1;

import java.util.Arrays;
import java.util.List;

public class FAQHelper extends Helper{

    private static final List<String> LIST_OF_ERRORS = List.of(
        "przeglądarka","Internet","hasło","login","połączenie"
    );

    @Override
    public void handle(String request) {
        if(Arrays.stream(request.split(" ")).anyMatch(LIST_OF_ERRORS::contains)){
            System.out.println("Odsyłamy do FAQ");
        }else{
            this.nextHelper.handle(request);
        }
    }
}
