package Farmer;


public abstract class Crop implements Produce {

    private boolean harvested;
    private boolean fertilized;

    public Crop(boolean harvested, boolean fertilized) {
        this.harvested = harvested;
        this.fertilized = fertilized;
    }

    public void setHarvested(boolean harvested) {
        this.harvested = harvested;
    }

    public void setFertilized(boolean fertilized) {
        this.fertilized = fertilized;
    }

    public boolean isFertilized() {
        return fertilized;
    }

    public boolean isHarvested() {
        return harvested;
    }

    public abstract Egg yield();
}