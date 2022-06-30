package pl.migibud.designpattern.visitor.ex4;

import pl.migibud.designpattern.visitor.ex4.activity.Activity;
import pl.migibud.designpattern.visitor.ex4.activity.Squash;
import pl.migibud.designpattern.visitor.ex4.activity.Treadmill;
import pl.migibud.designpattern.visitor.ex4.activity.Weights;
import pl.migibud.designpattern.visitor.ex4.visitor.Visitor;
import pl.migibud.designpattern.visitor.ex4.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50,10);

        VisitorImpl visitor = new VisitorImpl();
        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);

        List<Activity> activityList = Arrays.asList(treadmill,squash,weights);
        activityList.stream().forEach(a->a.accept(visitor));
    }
}
