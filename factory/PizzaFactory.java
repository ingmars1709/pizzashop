package factory;

import pizza.Pizza;

public interface PizzaFactory<T extends Pizza> {

    T manufacturePizza();

}
