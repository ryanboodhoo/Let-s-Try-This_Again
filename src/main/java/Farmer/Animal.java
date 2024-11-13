package Farmer;

// Animal (Inherits from NoiseMaker and Eater)
public abstract class Animal implements NoiseMaker , Eater {

    private int mealCount;

    public Animal() {
        this.mealCount = 0;
    }


    public void eatingMealCount(Corn food) {if (food != null) {
            mealCount++;
        }
    }

    public int getMealCount() {
        return mealCount;
    }

    public abstract void eat(Edible edible);

    @Override
    public void makeNoise() {
     }
}
