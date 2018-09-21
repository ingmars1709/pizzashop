package exercise.factory;

import exercise.pizza.ManufacturedMargheritaPizza;
import exercise.pizza.Margherita;
import exercise.pizza.Pizza;

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