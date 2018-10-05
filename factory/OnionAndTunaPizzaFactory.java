package factory;

import pizza.ManufacturedOnionAndTunaPizza;
import pizza.Pizza;

public final class OnionAndTunaPizzaFactory implements PizzaFactory<ManufacturedOnionAndTunaPizza> {

    private OnionAndTunaPizzaFactory() {}

    private static OnionAndTunaPizzaFactory factory = new OnionAndTunaPizzaFactory();

    public static OnionAndTunaPizzaFactory getInstance() {
        return factory;
    }

    @Override
    public ManufacturedOnionAndTunaPizza manufacturePizza() {
        return new ManufacturedOnionAndTunaPizza();
    }
}
