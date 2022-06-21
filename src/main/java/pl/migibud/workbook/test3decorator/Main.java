package pl.migibud.workbook.test3decorator;

public class Main {
    public static void main(String[] args) {

        Message msgClass = new MsgClass("To moja wiadomość");

        Message myFinalMessage = new ProcessMsg2(new ProcessMsg(msgClass));

        System.out.println(myFinalMessage.getText());





    }
}
