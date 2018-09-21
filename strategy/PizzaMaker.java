package strategy;

import pizza.Pizza;
import order.PizzaOrder;

public interface PizzaMaker {
    <T extends Pizza> T forOrder(PizzaOrder<T> pizzaOrder);
}
