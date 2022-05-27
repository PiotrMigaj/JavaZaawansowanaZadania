package pl.migibud.designpattern.chainofresponsibility.ex3;

import pl.migibud.designpattern.chainofresponsibility.ex3.request.MotherRequest;
import pl.migibud.designpattern.chainofresponsibility.ex3.shelf.*;

public class Main {
    public static void main(String[] args) {

        MotherRequest motherRequest = new MotherRequest(Shelf.LOW);

        Child ania = new Ania();
        Child tomek = new Tomek();
        Child antek = new Antek();

        ania.setTallerChild(tomek);
        tomek.setTallerChild(antek);
        tomek.processRequest(motherRequest);

    }
}
