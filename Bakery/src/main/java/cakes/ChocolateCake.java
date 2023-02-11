package cakes;

public class ChocolateCake extends Cake {
    private int id;
    private final String NAME = "Choclate cake";

    public ChocolateCake(){
    }

    public Ingredient getChocolatButterCream() {
        return chocolateButterCream;
    }
    public Ingredient getRaspberries() {
        return raspberries;
    }
    public Ingredient getChocolateGanash() {
        return chocolateGanash;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getBottomLayer() {
        return this.bottomLayer.toString();
    }

    @Override
    public String getFirstLayerTopping() {
        return this.firstLayerTopping.toString();
    }

    @Override
    public String getMidLayer() {
        return this.midLayer.toString();
    }

    @Override
    public String getSecondLayerTopping() {
        return this.secondLayerTopping.toString();
    }

    @Override
    public String getTopLayer() {
        return this.topLayer.toString();
    }

    @Override
    public String getNAME() {
        return NAME;
    }
}
