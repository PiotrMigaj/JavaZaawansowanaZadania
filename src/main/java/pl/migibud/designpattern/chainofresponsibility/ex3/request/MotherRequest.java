package pl.migibud.designpattern.chainofresponsibility.ex3.request;

import pl.migibud.designpattern.chainofresponsibility.ex3.shelf.Shelf;

public class MotherRequest {
    private Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }
}
