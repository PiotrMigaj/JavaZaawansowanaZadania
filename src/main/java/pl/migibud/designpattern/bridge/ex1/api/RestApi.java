package pl.migibud.designpattern.bridge.ex1.api;

public class RestApi implements Api {
    @Override
    public void send(String formattedMsg) {
        System.out.println("REST Api: "+formattedMsg);
    }
}
