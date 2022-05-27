package pl.migibud.designpattern.chainofresponsibility.ex3.shelf;

import pl.migibud.designpattern.chainofresponsibility.ex3.request.MotherRequest;

public abstract class Child {

    private Child tallerChild;

    public Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }

    public abstract void processRequest(MotherRequest motherRequest);
}
