package commands;

import cakes.Cake;
import cakes.ChocolateCake;
import cakes.Ingredient;
import controller.Controller;

public class RaspberriyGarnishCommand implements Command{
    @Override
    public Cake execute(Cake cake) {
        if(!(cake instanceof ChocolateCake)){
            return null;
        }
        cake.setRaspberries(new Ingredient("Hallon garnering"));
        Controller.printMessage("Tårtan garneras slutligen med hallon");
        return cake;
    }
}
