package pl.migibud.designpattern.bridge.ex1.api;

public class RpcApi implements Api {
    @Override
    public void send(String formattedMsg) {
        System.out.println("Rpc Api: "+formattedMsg);
    }
}
