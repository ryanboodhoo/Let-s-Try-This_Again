package Farmer;
//Horse (Inherits from Animal and Implements Rideable)
public class Horse extends Animal implements Rideable , Eater {

    private boolean ridden;
    private String name;


    public Horse(String name) {
        this.ridden = false;
        this.name = name;
    }

    public boolean canBeRidden() {
        return true;
    }

//    @Override
//    public void eat(Edible edible) {
//        System.out.println("is eating" + edible);
//    }
    @Override
    public void eat(Edible edible) {System.out.println( "horse:" + name + " is eating " + edible);}

    @Override
    public void makeNoise() {
        System.out.println( "*Neigh*");
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

    public String getHorsename() {
        return name;
    }
}