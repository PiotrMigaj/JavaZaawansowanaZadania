package pl.migibud.designpattern.interpreter.ex1;

public class TousandInterpreter extends Interpreter{
    @Override
    public String one() {
        return "M";
    }

    @Override
    public String four() {
        return " ";
    }

    @Override
    public String five() {
        return " ";
    }

    @Override
    public String nine() {
        return " ";
    }

    @Override
    public int factor() {
        return 1000;
    }
}
