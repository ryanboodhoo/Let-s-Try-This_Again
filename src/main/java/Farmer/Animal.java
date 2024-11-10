package Farmer;

// Animal (Inherits from NoiseMaker and Eater)
public abstract class Animal implements NoiseMaker {

    private int mealCount;

    public Animal() {
        this.mealCount = 0;
    }

    public void eat(Corn food) {
        if (food != null) {
            mealCount++;
        }
    }

    public int getMealCount() {
        return mealCount;
    }

    @Override
    public void makeNoise() {
     }
}
