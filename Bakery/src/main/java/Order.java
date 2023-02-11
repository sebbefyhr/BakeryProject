import builder.CakeBuilder;
import cakes.*;
import commands.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Order {
    private PropertyChangeSupport propertyChangeSupport;
    private CakeCommandPipeline pipeline;

    public Order(){
        this.propertyChangeSupport = new PropertyChangeSupport(this);
        this.pipeline = new CakeCommandPipeline();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        propertyChangeSupport.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(PropertyChangeListener listener){
        this.propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public PrincessCake preparePrincessCake(){
        Cake cake = new PrincessCake();
        propertyChangeSupport.firePropertyChange("Order initiated", this.toString(), cake.getNAME());

        new CakeBuilder(cake).addBottomLayer(new Ingredient("Tårtbotten"))
                .addFirstLayerTopping(new Ingredient("Vaniljkräm"))
                .addMidLayer(new Ingredient("Tårtbotten"))
                .addSeconLayerTopping(new Ingredient("Vaniljkräm"))
                .addTopLayer(new Ingredient("tårtbotten"))
                .bake();

        pipeline.addCommand(new AddWhippedCreamCommand());
        pipeline.addCommand(new AddMarsipanLidCommand());
        pipeline.addCommand(new AddMarsipanRoseCommand());
        pipeline.addCommand(new GarnishWithPowderedSugarCommand());
        pipeline.execute(cake);

        pipeline.removeCommands();
        propertyChangeSupport.firePropertyChange("Order is ready", this.toString(), cake.getNAME());
        return (PrincessCake) cake;

    }
    public OperaCake prepareOperaCake(){
        OperaCake cake = new OperaCake();
        propertyChangeSupport.firePropertyChange("Order initiated ", this.toString(), cake.getNAME());

        new CakeBuilder(cake).addBottomLayer(new Ingredient("Tårtbotten"))
                .addFirstLayerTopping(new Ingredient("Vaniljkräm"))
                .addMidLayer(new Ingredient("Tårtbotten"))
                .addSeconLayerTopping(new Ingredient("Hallonsylt"))
                .addTopLayer(new Ingredient("Tårtbotten"))
                .bake();

        pipeline.addCommand(new AddWhippedCreamCommand());
        pipeline.addCommand(new AddMarsipanLidCommand());
        pipeline.addCommand(new AddMarsipanRoseCommand());
        pipeline.addCommand(new GarnishWithPowderedSugarCommand());
        pipeline.execute(cake);

        pipeline.removeCommands();
        propertyChangeSupport.firePropertyChange(" is ready", this.toString(), cake.getNAME());

        return cake;
    }

    public ChocolateCake prepareChocolateCake(){
        ChocolateCake cake = new ChocolateCake();
        propertyChangeSupport.firePropertyChange("Order initiated ", this.toString(), cake.getNAME());

        new CakeBuilder(cake).addBottomLayer(new Ingredient("Chokladtårtbotten"))
                .addFirstLayerTopping(new Ingredient("Hallonmousse"))
                .addMidLayer(new Ingredient("Chokladtårtbotten"))
                .addSeconLayerTopping(new Ingredient("Hallonmousse"))
                .addTopLayer(new Ingredient("Chokladtårtbotten"))
                .bake();

        pipeline.addCommand(new AddChocolateButterCreamCommand());
        pipeline.addCommand(new AddChocolateganashCommand());
        pipeline.addCommand(new RaspberriyGarnishCommand());
        pipeline.execute(cake);

        pipeline.removeCommands();
        propertyChangeSupport.firePropertyChange("Order is ready", this.toString(), cake.getNAME());

        return cake;
    }
}
