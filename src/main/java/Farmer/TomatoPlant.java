package Farmer;

public class TomatoPlant extends Crop {


    public TomatoPlant(boolean harvested, boolean fertilized) {
        super(harvested, fertilized);
    }

    @Override
    public Edible yield() {
        Tomato tomato = null;
        if (this.isHarvested() && this.isFertilized()){
            tomato = new Tomato();
        } else {
            System.out.println("tomato is not edible");
        }
        return tomato;
    }
}