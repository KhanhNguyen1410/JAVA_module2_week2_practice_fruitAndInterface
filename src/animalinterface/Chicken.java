package animalinterface;

import Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String howToEst() {
        return "mo thoc";
    }

    @Override
    public String makeSound() {
        return "quac quac";
    }
}
