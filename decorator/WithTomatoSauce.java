package decorator;

import java.util.Set;

public class WithTomatoSauce extends PizzaDecorator {

    public WithTomatoSauce(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Set<pizza.Pizza.Topping> getToppings() {
        return super.getToppings();
    }

    @Override
    public Set<pizza.Pizza.Sauce> getSauces() {
        Set<pizza.Pizza.Sauce> sauces = super.getSauces();
        sauces.add(pizza.Pizza.Sauce.TOMATO);
        return sauces;
    }

    @Override
    public Integer getCost() {
        return super.getCost() + 1;
    }
}