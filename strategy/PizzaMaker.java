package exercise.strategy;

import exercise.pizza.Pizza;
import exercise.order.PizzaOrder;

public interface PizzaMaker {
    <T extends Pizza> T forOrder(PizzaOrder<T> pizzaOrder);
}
