package pl.migibud.designpattern.chainofresponsibility.ex3.shelf;

import pl.migibud.designpattern.chainofresponsibility.ex3.request.MotherRequest;

public class Ania extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf()==Shelf.LOW){
            System.out.println("Ania zdjęcła słoik z półki!");
        }else {
            this.getTallerChild().processRequest(motherRequest);
        }
    }
}
