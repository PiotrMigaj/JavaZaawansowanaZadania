package pl.migibud.designpattern.visitor.ex4.visitor;

import pl.migibud.designpattern.visitor.ex4.activity.Squash;
import pl.migibud.designpattern.visitor.ex4.activity.Treadmill;
import pl.migibud.designpattern.visitor.ex4.activity.Weights;

public interface Visitor {
    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);
}
