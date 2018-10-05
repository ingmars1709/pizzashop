package decorator;

import java.util.HashSet;
import java.util.Set;

public class PlainPizza implements Pizza {

    @Override
    public Set<pizza.Pizza.Topping> getToppings() {
        return new HashSet<>();
    }

    @Override
    public Set<pizza.Pizza.Sauce> getSauces() {
        return new HashSet<>();
    }

    @Override
    public Integer getCost() {
        return 2;
    }
}
