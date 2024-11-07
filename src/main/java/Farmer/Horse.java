package Farmer;
//Horse (Inherits from Animal and Implements Rideable)
public class Horse extends Animal implements Rideable {

    private boolean ridden;

    public Horse() {
        this.ridden = false;
    }

    public boolean canBeRidden() {
        return true;
    }

    @Override
    public boolean eat(Edible edible) {
        if (edible != null) {
            System.out.println("Horse is eating " + edible);
        }
        return true;
    }

    @Override
    public void makeNoise() {
        System.out.println("*Neigh*");
    }

    @Override
    public boolean ride() {
        if (canBeRidden()) {
            this.ridden = true;
            System.out.println("You are now riding the horse.");
        } else {
            System.out.println("This horse cannot be ridden.");
        }
        return true;
    }

    public boolean hasBeenRidden() {
        return ridden;
    }
}