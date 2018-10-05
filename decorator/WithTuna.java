package decorator;

import java.util.Set;

public class WithTuna extends PizzaDecorator {

    public WithTuna(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Set<pizza.Pizza.Topping> getToppings() {
        Set<pizza.Pizza.Topping> toppings = super.getToppings();
        toppings.add(pizza.Pizza.Topping.TUNA);
        return toppings;
    }

    @Override
    public Set<pizza.Pizza.Sauce> getSauces() {
        return super.getSauces();
    }

    @Override
    public Integer getCost() {
        return super.getCost() + 2;
    }
}
