package Farmer;

public class Tractor extends FarmVehicle {

    public Tractor() {}

    @Override
    public void makeNoise() {
        System.out.println("Tractor makes noise.");
    }

    @Override
    public void canRide() {
        System.out.println("We can ride the tractor.");
    }

    public static void harvest(CropRow cropRow){
        System.out.println("Harvesting crops from crop row...");
        cropRow.getCrops();
    }

}
