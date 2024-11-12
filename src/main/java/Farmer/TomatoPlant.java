package Farmer;

public class TomatoPlant extends Crop {


    public TomatoPlant(boolean harvested, boolean fertilized) {
        super(harvested, fertilized);
    }

    @Override
    public Egg yield() {
        System.out.println("Tomato plant is yielding tomatoes!");
        return new Egg();
    }
}
