package pl.migibud.designpattern.statepattern.ex1;

public class VibrationMode implements PhoneModeState{
    @Override
    public void notificationMode(Context context) {
        context.setPhoneModeState(this);
    }

    public String toString(){
        return "Wibracje";
    }
}
