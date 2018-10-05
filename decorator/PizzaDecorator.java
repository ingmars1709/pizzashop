package decorator;

import java.util.Set;

public abstract class PizzaDecorator implements Pizza {

    private final Pizza pizza;

    PizzaDecorator(final Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Set<pizza.Pizza.Topping> getToppings() {
        return pizza.getToppings();
    }

    @Override
    public Set<pizza.Pizza.Sauce> getSauces() {
        return pizza.getSauces();
    }

    @Override
    public Integer getCost() {
        return pizza.getCost();
    }
}
