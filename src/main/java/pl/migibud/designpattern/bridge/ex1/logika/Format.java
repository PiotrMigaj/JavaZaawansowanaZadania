package pl.migibud.designpattern.bridge.ex1.logika;

import pl.migibud.designpattern.bridge.ex1.api.Api;

public abstract class Format {

    String text;
    Api api;

    public abstract void sendMessage();

}
