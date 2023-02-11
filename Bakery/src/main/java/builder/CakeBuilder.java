package builder;

import cakes.*;
import controller.Controller;

public class CakeBuilder {
    private Cake cake;

    public CakeBuilder (Cake cake){
        this.cake = cake;
    }

    public CakeBuilder addBottomLayer(Ingredient bottomLayer){
        cake.setBottomLayer(bottomLayer);
        Controller.printMessage(cake.getBottomLayer() + " for " + cake.getNAME() + " added.");
        return this;
    }
    public CakeBuilder addFirstLayerTopping(Ingredient firstLayerTopping){
        cake.setFirstLayerTopping(firstLayerTopping);
        Controller.printMessage(cake.getFirstLayerTopping() +" for "+ cake.getNAME() + " added.");
        return this;
    }
    public CakeBuilder addMidLayer(Ingredient midLayer){
        cake.setMidLayer(midLayer);
        Controller.printMessage(cake.getMidLayer() + " for " + cake.getNAME() + " added.");
        return this;
    }
    public CakeBuilder addSeconLayerTopping (Ingredient secondLayerTopping){
        cake.setSecondLayerTopping(secondLayerTopping);
        Controller.printMessage(cake.getSecondLayerTopping() + " for " + cake.getNAME() + " added.");
        return this;
    }
    public CakeBuilder addTopLayer(Ingredient topLayer){
        cake.setTopLayer(topLayer);
        Controller.printMessage(cake.getTopLayer() + " for " + cake.getNAME() + " added");
        return this;
    }
    public Cake bake(){
        return cake;
    }
}
