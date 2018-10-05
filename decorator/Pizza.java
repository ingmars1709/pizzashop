package decorator;

import java.util.Set;

public interface Pizza {

    Set<pizza.Pizza.Topping> getToppings();

    Set<pizza.Pizza.Sauce> getSauces();

    Integer getCost();
}