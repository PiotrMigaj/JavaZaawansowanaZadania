package pl.migibud.designpattern.interpreter.ex1;

public class HundredInterpreter extends Interpreter{
    @Override
    public String one() {
        return "C";
    }

    @Override
    public String four() {
        return "CD";
    }

    @Override
    public String five() {
        return "D";
    }

    @Override
    public String nine() {
        return "CM";
    }

    @Override
    public int factor() {
        return 100;
    }
}
