package cakes;

public abstract class Cake {

    Ingredient bottomLayer;
    Ingredient midLayer;
    Ingredient topLayer;
    Ingredient firstLayerTopping;
    Ingredient secondLayerTopping;

    Ingredient whippedCream;
    Ingredient marsipanLid;
    Ingredient marsipanRose;
    Ingredient powderedSugar;

    Ingredient chocolateButterCream;
    Ingredient chocolateGanash;
    Ingredient raspberries;


    public Cake(Ingredient bottomLayer, Ingredient midLayer,
                Ingredient topLayer, Ingredient firstLayerTopping,
                Ingredient secondLayerTopping) {
        this.bottomLayer = bottomLayer;
        this.midLayer = midLayer;
        this.topLayer = topLayer;
        this.firstLayerTopping = firstLayerTopping;
        this.secondLayerTopping = secondLayerTopping;

    }

    public Cake() {

    }

    public void setBottomLayer(Ingredient bottomLayer) {
        this.bottomLayer = bottomLayer;
    }
    public void setFirstLayerTopping(Ingredient firstToppingLayer) {
        this.firstLayerTopping = firstToppingLayer;
    }
    public void setMidLayer(Ingredient midLayer){
        this.midLayer = midLayer;
    }
    public void setSecondLayerTopping(Ingredient secondLayerTopping){
        this.secondLayerTopping = secondLayerTopping;
    }
    public void setTopLayer(Ingredient topLayer){
        this.topLayer = topLayer;
    }

    public void setWhippedCream(Ingredient whippedCream){
        this.whippedCream = whippedCream;
    }
    public void setMarsipanLid(Ingredient marsipanLid){
        this.marsipanLid = marsipanLid;
    }
    public void setMarsipanRose(Ingredient marsipanRose){
        this.marsipanRose = marsipanRose;
    }
    public void setPowderedSugar(Ingredient powderedSugar){
        this.powderedSugar = powderedSugar;
    }

    public void setChocolatButterCream(Ingredient chocolatButterCream){
        this.chocolateButterCream = chocolatButterCream;
    }
    public void setChocolateGanash(Ingredient chocolateGanash) {
        this.chocolateGanash = chocolateGanash;
    }
    public void setRaspberries(Ingredient raspberries) {
        this.raspberries = raspberries;
    }

    public abstract String getBottomLayer();
    public abstract String getFirstLayerTopping();
    public abstract String getMidLayer();
    public abstract String getSecondLayerTopping();
    public abstract String getTopLayer();
    public abstract String getNAME();

}
