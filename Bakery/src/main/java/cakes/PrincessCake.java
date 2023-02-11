package cakes;

public class PrincessCake extends Cake {
    private int id;
    private final String NAME = "Princess cake";

    public PrincessCake() {
    }

    public Ingredient getPowderedSugar() {
        return powderedSugar;
    }
    public Ingredient getMarsipanRose(){
        return this.marsipanRose;
    }
    public Ingredient getWhippedCream() {
        return this.whippedCream;
    }
    public Ingredient getMarsipanLid(){
        return this.marsipanLid;
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