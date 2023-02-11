package commands;

import cakes.Cake;
import cakes.Ingredient;
import controller.Controller;


public class GarnishWithPowderedSugarCommand implements Command{
    @Override
    public Cake execute(Cake cake) {
        cake.setPowderedSugar(new Ingredient("Florsocker"));
        Controller.printMessage("Pudra florsocker över tårtan");
        return cake;
    }
}
