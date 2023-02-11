package commands;

import cakes.Cake;
import cakes.ChocolateCake;
import cakes.Ingredient;
import controller.Controller;

public class AddChocolateganashCommand implements Command{
    @Override
    public Cake execute(Cake cake) {
        if(!(cake instanceof ChocolateCake)){
            return null;
        }
        cake.setChocolateGanash(new Ingredient("Chokladganash"));
        Controller.printMessage("Häller över Chokladganash");
        return cake;
    }
}
