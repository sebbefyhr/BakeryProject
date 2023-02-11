package commands;

import cakes.Cake;
import cakes.Ingredient;
import controller.Controller;

public class AddWhippedCreamCommand implements Command{
    @Override
    public Cake execute(Cake cake) {
        cake.setWhippedCream(new Ingredient("Vispgrädde"));
        Controller.printMessage("Har på vispgrädde");
        return cake;
    }
}
