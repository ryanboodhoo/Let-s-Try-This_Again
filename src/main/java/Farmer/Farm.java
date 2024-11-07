package Farmer;

// Farm class represents a farm that contains multiple stables, chicken coops, and a farmhouse.
import java.util.ArrayList;
import java.util.List;

public class Farm {
    // List to hold all stables on the farm.
    private List<Stable> stables;

    // List to hold all chicken coops on the farm.
    private List<ChickenCoop> chickenCoops;

    // Single instance of a farmhouse on the farm.
    private FarmHouse farmHouse;

    // Constructor to initialize the farm with empty lists for stables and chicken coops,
    // and a new FarmHouse instance.
    public Farm() {
        this.stables = new ArrayList<>();
        this.chickenCoops = new ArrayList<>();
        this.farmHouse = new FarmHouse();
    }

    // Method to add a stable to the farm.
    public void addStable(Stable stable) {
        stables.add(stable);
    }

    // Method to add a chicken coop to the farm.
    public void addChickenCoop(ChickenCoop chickenCoop) {
        chickenCoops.add(chickenCoop);
    }

    // Method to set a farmhouse for the farm.
    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    // Method to retrieve all stables on the farm.
    public List<Stable> getStables() {
        return stables;
    }

    // Method to retrieve all chicken coops on the farm.
    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    // Method to retrieve the farmhouse on the farm.
    public FarmHouse getFarmHouse() {
        return farmHouse;
    }
}

