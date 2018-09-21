package builder;

import pizza.Pizza;

public interface PizzaBuilder<T extends Pizza> {

    PizzaBuilder<T> prepareDough();

    PizzaBuilder<T> addSauce();

    PizzaBuilder<T> addTopping();

    T bake();

}