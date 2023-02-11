package commands;

import cakes.Cake;
import controller.Controller;

import java.util.ArrayList;

public class CakeCommandPipeline {
    private ArrayList<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        this.commandList.add(command);
    }

    public Cake execute(Cake cake){
        for(Command c : commandList){
            c.execute(cake);
        }
        return cake;
    }
    public void removeCommands(){
        for(int i = 0; i < commandList.size(); i++){
            commandList.remove(i);
        }
    }
}
