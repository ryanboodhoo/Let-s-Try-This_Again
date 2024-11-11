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

     public boolean eat(Edible edible) {
        if (edible != null) {
            return true;
        }
         return false;
     }

    @Override
    public void makeNoise() {
        System.out.println("*Neigh*");
    }

     public boolean ride(Person person) {
        if (canBeRidden()) {
            this.ridden = true;
            System.out.println( person + " is now riding the horse.");
        } else {
            System.out.println("This horse cannot be ridden.");
        }
        return true;
    }

    public boolean hasBeenRidden() {
        return ridden;
    }

    @Override
    public void canRide() {

    }
    @Override
    public String toString() {
        return "Horse";  // Or if you have a specific horse name, return it here
    }
}