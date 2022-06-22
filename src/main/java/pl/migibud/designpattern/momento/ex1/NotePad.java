package pl.migibud.designpattern.momento.ex1;

public class NotePad {

    private TextWindow textWindow;
    private Momento momento;

    public NotePad(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void writeText(String input){
        textWindow.addText(input);
    }

    public void save(){
        this.momento = textWindow.save();
    }

    public void undo(){
        this.textWindow.rollback(this.momento);
    }

    public void displayText(){
        System.out.println(textWindow.getText());
    }
}
