package cakes;

public class OperaCake extends Cake {
    private int id;
    private final String NAME = "Opera cake";

    public OperaCake() {
    }

    public Ingredient getMarsipanLid(){
        return this.marsipanLid;
    }
    public Ingredient getPowderedSugar() {
        return powderedSugar;
    }
    public Ingredient getWhippedCream() {
        return this.whippedCream;
    }
    public Ingredient getMarsipanRose(){
        return this.marsipanRose;
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