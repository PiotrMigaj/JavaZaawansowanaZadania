package pl.migibud.designpattern.statepattern.ex1;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        SilentMode silentMode = new SilentMode();
        silentMode.notificationMode(context);

        context.notifyUser();

        LoudMode loudMode = new LoudMode();
        loudMode.notificationMode(context);

        context.notifyUser();
    }
}
