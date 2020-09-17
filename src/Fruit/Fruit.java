package Fruit;

import Edible.Edible;

public abstract class Fruit implements Edible {
    @Override
    public String howToEst() {
        return "an di";
    }
}
