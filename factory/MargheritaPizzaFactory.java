package factory;

import pizza.ManufacturedMargheritaPizza;
import pizza.Pizza;

public final class MargheritaPizzaFactory implements PizzaFactory {

    private MargheritaPizzaFactory() {}

    private static MargheritaPizzaFactory factory = new MargheritaPizzaFactory();

    public static MargheritaPizzaFactory getInstance() {
        return factory;
    }

    @Override
    public Pizza manufacturePizza() {
        return new ManufacturedMargheritaPizza();
    }
}