package pl.migibud.designpattern.interpreter.ex1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Context {

    private String romanNumber;
    private String arabicNumber;

    public Context(String romanNumber) {
        this.romanNumber = romanNumber;
    }
}
