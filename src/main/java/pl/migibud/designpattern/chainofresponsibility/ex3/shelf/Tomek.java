package pl.migibud.designpattern.chainofresponsibility.ex3.shelf;

import pl.migibud.designpattern.chainofresponsibility.ex3.request.MotherRequest;

public class Tomek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf()==Shelf.MEDIUM){
            System.out.println("Tomek zdjął słoik z półki!");
        }else {
            this.getTallerChild().processRequest(motherRequest);
        }
    }
}
