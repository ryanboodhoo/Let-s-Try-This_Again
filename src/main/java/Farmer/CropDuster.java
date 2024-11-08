package Farmer;

public class CropDuster extends FarmVehicle implements Aircraft{

    public CropDuster() {}

    @Override
    public void canFly() {
        System.out.println("Crop duster flies.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Crop duster makes noise.");
    }

    @Override
    public void canRide() {
        System.out.println("We can ride the crop duster.");
    }

    public void fertilize(CropRow cropRow){
        System.out.println("Fertilizing crop row...");
    }

}
