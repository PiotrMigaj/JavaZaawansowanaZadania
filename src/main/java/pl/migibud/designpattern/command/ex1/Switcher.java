package pl.migibud.designpattern.command.ex1;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    public List<Command> commandList;

    public Switcher() {
        this.commandList = new ArrayList<>();
    }

    public void addCommand(Command command){
        this.commandList.add(command);
    }

    public void executeCommands(){
        for (Command c:commandList) {
            c.execute();
        }
    }
}
