package pl.migibud.designpattern.statepattern.ex1;

public class Context {

    private PhoneModeState phoneModeState;

    public void setPhoneModeState(PhoneModeState phoneModeState) {
        this.phoneModeState = phoneModeState;
    }

    public void notifyUser(){
        System.out.println(phoneModeState.toString());
    }
}
