package pl.migibud.designpattern.visitor.ex4.activity;

import lombok.Getter;
import pl.migibud.designpattern.visitor.ex4.visitor.Visitor;

@Getter
public class Weights implements Activity{

    private int weight;
    private int reps;

    public Weights(int weight, int reps) {
        this.weight = weight;
        this.reps = reps;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
