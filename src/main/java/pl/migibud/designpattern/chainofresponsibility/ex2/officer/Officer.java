package pl.migibud.designpattern.chainofresponsibility.ex2.officer;

import pl.migibud.designpattern.chainofresponsibility.ex2.message.Message;

public abstract class Officer {

    private Officer superiorOfficer;

    public Officer getSuperiorOfficer() {
        return superiorOfficer;
    }

    public void setSuperiorOfficer(Officer superiorOfficer) {
        this.superiorOfficer = superiorOfficer;
    }

    public abstract void processMessage(Message message);

}
