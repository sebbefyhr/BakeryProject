package commands;

import cakes.Cake;
import cakes.ChocolateCake;
import cakes.Ingredient;
import controller.Controller;

public class AddChocolateButterCreamCommand implements Command {
    @Override
    public Cake execute(Cake cake){
        if(!(cake instanceof ChocolateCake)){
            return null;
        }
        cake.setChocolatButterCream(new Ingredient("Chokladsmörkräm"));
        Controller.printMessage("Brer på chokladsmörkräm");
        return cake;
    }
}
