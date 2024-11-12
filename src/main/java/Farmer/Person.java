package Farmer;

// Person class represents an individual who can eat, make noise, and ride objects.
// Implements Eater and Rider interfaces to define specific behaviors.
public class Person implements Eater, Rider {
    // Unique identifier for each person.
    private String id;

    // Name of the person.
    private  String name;

    // Constructor to initialize Person with an ID and name.
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Implementation of the eat method from the Eater interface.
    // Allows the person to consume an edible object.
    @Override
    public void eat(Edible edible) {
        System.out.println(name + " is eating " + edible);
    }

    // Method to allow the person to make noise, representing a general behavior.
    public void makeNoise() {
        System.out.println(name + " is making noise.");
    }

    // Implementation of the mount method from the Rider interface.
    // Allows the person to mount a rideable object.
    @Override
    public void mount(Rideable rideable) {
        System.out.println(name + " is mounting a rideable object.");
    }

    // Implementation of the dismount method from the Rider interface.
    // Allows the person to dismount from a rideable object.
    @Override
    public void dismount(Rideable rideable) {
        System.out.println(name + " is dismounting a rideable object.");
    }

    public String getName() {
        return name;
    }
    public void plant(CropRow cropRow, Crop crop) {
        cropRow.addCrop(crop);
        System.out.println(name + " is planting " + crop.getClass().getSimpleName() + " in the crop row.");
    }


    @Override
    public String toString() {
        return this.name;
    }
}


