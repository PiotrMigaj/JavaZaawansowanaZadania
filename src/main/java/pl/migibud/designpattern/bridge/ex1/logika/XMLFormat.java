package pl.migibud.designpattern.bridge.ex1.logika;

import pl.migibud.designpattern.bridge.ex1.api.Api;

public class XMLFormat extends Format {

    public XMLFormat(String text, Api api) {
        this.text = "<message>"+text+"</message>";
        this.api = api;
    }

    @Override
    public void sendMessage() {
        this.api.send(this.text);
    }
}
