package pl.migibud.designpattern.visitor.ex4.activity;

import lombok.Getter;
import pl.migibud.designpattern.visitor.ex4.visitor.Visitor;

@Getter
public class Treadmill implements Activity {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
