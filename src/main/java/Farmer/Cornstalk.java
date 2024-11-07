package Farmer;

public  class Cornstalk extends Crop implements Edible {


    public Cornstalk(boolean harvested, boolean fertilized) {
        super(harvested, fertilized);
    }

    @Override
    public Egg yield() {
        Egg egg = new Egg();
        return egg;
    }

}