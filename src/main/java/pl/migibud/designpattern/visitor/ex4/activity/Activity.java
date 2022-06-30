package pl.migibud.designpattern.visitor.ex4.activity;

import pl.migibud.designpattern.visitor.ex4.visitor.Visitor;

public interface Activity {
    void accept(Visitor visitor);
}
