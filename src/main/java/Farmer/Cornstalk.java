package Farmer;

public class Cornstalk extends Crop implements Edible{


    public Cornstalk(boolean harvested, boolean fertilized) {
        super(harvested, fertilized);
    }

    @Override
    public Edible yield() {
        Corn corn = null;
        if (this.isHarvested() && this.isFertilized()){
            corn = new Corn();
        } else {
            System.out.println("cornstalk is not edible");
        }
        return corn;
    }
}