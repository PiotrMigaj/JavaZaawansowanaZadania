package pl.migibud.designpattern.chainofresponsibility.ex3.shelf;

import pl.migibud.designpattern.chainofresponsibility.ex3.request.MotherRequest;

public class Antek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf()==Shelf.HIGH){
            System.out.println("Antek zdjął słoik z półki!");
        }else {
            System.out.println("Zły adresat wiadomości");
        }
    }
}
