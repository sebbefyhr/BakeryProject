package commands;

import cakes.Cake;
import cakes.Ingredient;
import cakes.PrincessCake;
import controller.Controller;

public class AddMarsipanRoseCommand implements Command{
    @Override
    public Cake execute(Cake cake) {
        cake.setMarsipanRose(new Ingredient("Marsipanros"));
        Controller.printMessage("Marsipanros pålagd");
        return cake;
    }
}
