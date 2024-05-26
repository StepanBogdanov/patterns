package com.bogstepan.patterns.factory;

public class CoffeeFactory {

    Coffee coffee = null;

    public Coffee getCoffee(CoffeeType type) {
        switch (type) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
        }
        return coffee;
    }
}
