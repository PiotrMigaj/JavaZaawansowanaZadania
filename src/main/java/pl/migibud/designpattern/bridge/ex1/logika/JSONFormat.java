package pl.migibud.designpattern.bridge.ex1.logika;

import pl.migibud.designpattern.bridge.ex1.api.Api;

public class JSONFormat extends Format {

    public JSONFormat(String text, Api api) {
        this.text = "{\"message\":\"" + text + "\"}";
        this.api = api;
    }

    @Override
    public void sendMessage() {
        this.api.send(this.text);
    }
}
