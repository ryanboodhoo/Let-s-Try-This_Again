package Farmer;
import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {
    private List<Chicken> chickens;

    public ChickenCoop() {
        this.chickens = new ArrayList<>();
    }

    public void addChicken(Chicken chicken) {
        chickens.add(chicken);
    }

    public List<Chicken> getChickens() {
        return chickens;
    }
}
