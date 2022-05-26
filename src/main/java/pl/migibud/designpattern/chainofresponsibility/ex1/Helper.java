package pl.migibud.designpattern.chainofresponsibility.ex1;

public abstract class Helper {

    Helper nextHelper;

    public void setNextHelper(Helper nextHelper) {
        this.nextHelper = nextHelper;
    }

    public abstract void handle(String request);
}

