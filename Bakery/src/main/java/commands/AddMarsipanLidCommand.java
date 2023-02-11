package commands;

import cakes.Cake;
import cakes.Ingredient;
import cakes.OperaCake;
import cakes.PrincessCake;
import controller.Controller;

public class AddMarsipanLidCommand implements Command {
    @Override
    public Cake execute(Cake cake) {
        if(cake instanceof PrincessCake){
            cake.setMarsipanLid(new Ingredient("Grönt marsipanlock"));
            Controller.printMessage("Grönt marsinpanlock pålagt");
        } else if(cake instanceof OperaCake){
            cake.setMarsipanLid(new Ingredient("Rosa marsipanlock"));
            Controller.printMessage("Rosa marsinpanlock pålagt");
        }
        return cake;
    }
}
