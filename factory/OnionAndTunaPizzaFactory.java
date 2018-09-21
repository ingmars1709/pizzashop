package exercise.factory;

import exercise.pizza.ManufacturedOnionAndTunaPizza;
import exercise.pizza.Pizza;

public final class OnionAndTunaPizzaFactory implements PizzaFactory {

    private OnionAndTunaPizzaFactory() {}

    public static OnionAndTunaPizzaFactory factory = new OnionAndTunaPizzaFactory();

    public static OnionAndTunaPizzaFactory getInstance() {
        return factory;
    }

    @Override
    public Pizza manufacturePizza() {
        return new ManufacturedOnionAndTunaPizza();
    }
}
