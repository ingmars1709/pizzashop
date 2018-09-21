package exercise.builder;

import exercise.pizza.Pizza;
import exercise.order.PizzaOrder;

public interface PizzaOrderBuilder<T extends Pizza> {

    default PizzaOrderBuilder<T> addSauce(Pizza.Sauce sauce) {
        System.out.println("Cannot add " + sauce + " to this order.");
        return this;
    };

    default PizzaOrderBuilder<T> addTopping(Pizza.Topping topping) {
        System.out.println("Cannot add " + topping + " to this order.");
        return this;
    };

    PizzaOrder<T> order();

}
