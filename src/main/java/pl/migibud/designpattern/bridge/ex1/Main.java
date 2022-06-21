package pl.migibud.designpattern.bridge.ex1;

import pl.migibud.designpattern.bridge.ex1.api.RestApi;
import pl.migibud.designpattern.bridge.ex1.logika.Format;
import pl.migibud.designpattern.bridge.ex1.logika.JSONFormat;

public class Main {
    public static void main(String[] args) {

        Format format = new JSONFormat("Hejka !",new RestApi());
        format.sendMessage();

    }
}
