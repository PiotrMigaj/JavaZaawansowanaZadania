package pl.migibud.designpattern.chainofresponsibility.ex2;

import pl.migibud.designpattern.chainofresponsibility.ex2.message.Message;
import pl.migibud.designpattern.chainofresponsibility.ex2.officer.*;

public class Main {
    public static void main(String[] args) {

        Message message = new Message("Atakować",20, OfficerRank.GENERAL);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        general.processMessage(message);
    }
}
