package Farmer;
// Chicken (Inherits from Animal and also Produce which can yield EdibleEgg when hasBeenFertilized is false)
public class Chicken extends Animal implements Produce {

    private boolean hasBeenFertilized;

    public Chicken( boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }


    public Egg laidEgg() {
        Egg egg = new Egg(); // Create a new Egg
        System.out.println("Chicken has laid an " + egg);
        return egg;
    }
    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }


    public void eat(Edible edible) {
        Chicken chicken = new Chicken(true);
        System.out.println("Chicken eats" + edible);
        chicken.eat(new Corn());

    }

    @Override
    public void makeNoise() {
        System.out.println("bawk bawk");
    }

    @Override
    public Egg yield() {
        Egg egg = null;
        if (hasBeenFertilized){
            egg = new Egg();
        } else {
            System.out.println("Egg is not edible");
        }
        return egg;
    }
}