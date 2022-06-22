package pl.migibud.designpattern.momento.ex1;

public class Main {

    public static void main(String[] args) {

        NotePad notePad = new NotePad(new TextWindow());
        notePad.writeText("pierwszy wiersz tekstu \n");
        notePad.writeText("drugi wiersz tekstu \n");

        notePad.save();
        notePad.writeText("trzeci wiersz tekstu \n");
        notePad.displayText();

        notePad.undo();

        notePad.displayText();

    }
}
