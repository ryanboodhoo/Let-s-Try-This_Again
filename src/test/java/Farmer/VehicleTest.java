package Farmer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void testCanRide(){
        Vehicle tractor = new Tractor();
        Vehicle cropDuster = new CropDuster();

        tractor.canRide();
        cropDuster.canRide();
    }

    @Test
    public void testMakesNoise(){
        Vehicle tractor = new Tractor();
        Vehicle cropDuster = new CropDuster();

        tractor.makeNoise();
        cropDuster.makeNoise();
    }

}