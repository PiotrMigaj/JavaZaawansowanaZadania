package pl.migibud.designpattern.chainofresponsibility.ex1;

import java.util.Arrays;
import java.util.List;

public class ConsultantHelper extends Helper{

    private static final List<String> LIST_OF_ERRORS = List.of(
        "BusinessException","uprawnień","wygasło","oprogramowanie"
    );

    @Override
    public void handle(String request) {
        if(Arrays.stream(request.split(" ")).anyMatch(LIST_OF_ERRORS::contains)){
            System.out.println("Odsyłamy zapytanie do konsultanta");
        }else{
            this.nextHelper.handle(request);
        }
    }
}
