package factory;

import pizza.ManufacturedOnionAndTunaPizza;
import pizza.Pizza;

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
