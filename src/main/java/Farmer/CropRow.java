package Farmer;

// CropRow class represents a row of crops in a field.
import java.util.ArrayList;
import java.util.List;

public class CropRow {
    // List to hold all crops planted in this row.
    private List<Crop> crops;

    // Constructor to initialize the CropRow with an empty list of crops.
    public CropRow() {
        this.crops = new ArrayList<>();
    }

    // Method to add a crop to the CropRow.
    public void addCrop(Crop crop) {
        crops.add(crop);
    }

    // Method to retrieve the list of crops in this CropRow.
    public List<Crop> getCrops() {
        return crops;
    }
}

