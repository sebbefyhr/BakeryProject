import cakes.ChocolateCake;
import cakes.OperaCake;
import cakes.PrincessCake;
import controller.Controller;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Customer implements PropertyChangeListener{
    private int id;
    private String name;
    private Order order;


    public Customer(String name){
        this.name = name;
        this.order = new Order();
        order.addPropertyChangeListener(this);
    }
    public Customer(){

    }

    public PrincessCake orderPrincessCake(){
        return order.preparePrincessCake();
    }
    public OperaCake orderOperaCake(){
        return order.prepareOperaCake();
    }
    public ChocolateCake orderChocolateCake(){
        return order.prepareChocolateCake();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Controller.printMessage("Customer detected an update on order: " + evt.getNewValue() + " " +
                evt.getPropertyName() + " for " + this.name);
    }
}
