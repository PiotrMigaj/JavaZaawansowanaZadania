package pl.migibud.designpattern.interpreter.ex1;

public class OneInterpreter extends Interpreter{
    @Override
    public String one() {
        return "I";
    }

    @Override
    public String four() {
        return "IV";
    }

    @Override
    public String five() {
        return "V";
    }

    @Override
    public String nine() {
        return "IX";
    }

    @Override
    public int factor() {
        return 1;
    }
}
