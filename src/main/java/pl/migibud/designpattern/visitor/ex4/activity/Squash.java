package pl.migibud.designpattern.visitor.ex4.activity;

import lombok.Getter;
import pl.migibud.designpattern.visitor.ex4.visitor.Visitor;

@Getter
public class Squash implements Activity {

    private int minutesPlayed;

    public Squash(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
