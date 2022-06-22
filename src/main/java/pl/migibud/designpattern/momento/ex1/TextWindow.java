package pl.migibud.designpattern.momento.ex1;

public class TextWindow {

    private StringBuilder text;

    public TextWindow() {
        this.text = new StringBuilder();
    }

    public StringBuilder getText() {
        return text;
    }

    public void addText(String input){
        text.append(input);
    }

    public Momento save(){
        return new Momento(this.text.toString());
    }

    public void rollback(Momento momento){
        this.text = new StringBuilder(momento.getText());
    }
}
