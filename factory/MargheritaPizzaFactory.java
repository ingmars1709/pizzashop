package factory;

import pizza.ManufacturedMargheritaPizza;
import pizza.Pizza;

public final class MargheritaPizzaFactory implements PizzaFactory<ManufacturedMargheritaPizza> {

    private MargheritaPizzaFactory() {}

    private static MargheritaPizzaFactory factory = new MargheritaPizzaFactory();

    public static MargheritaPizzaFactory getInstance() {
        return factory;
    }

    public ManufacturedMargheritaPizza manufacturePizza() {
        return new ManufacturedMargheritaPizza();
    }
}