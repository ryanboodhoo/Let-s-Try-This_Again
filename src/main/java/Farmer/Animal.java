package Farmer;
//Animal (Inherits from NoiseMaker and Eater)
public abstract class Animal implements NoiseMaker, Eater {

    public Animal(String Noise) {
    }

    public abstract boolean eat(Edible edible);

    @Override
    public abstract void makeNoise();
}