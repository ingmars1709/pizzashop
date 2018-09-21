package exercise.strategy;

import exercise.pizza.Pizza;
import exercise.order.PizzaOrder;

public class Valentino implements PizzaMaker {

    public Valentino() {
    }

    @Override
    public <T extends Pizza> T forOrder(PizzaOrder<T> pizzaOrder) {
        T pizza = pizzaOrder.getPizzaTypeMaking().get();

        pizza.prepareDough();

        for (Pizza.Sauce sauce : pizzaOrder.getSauces()) {
            System.out.println("Valentino adding " + sauce + " sauce");
            pizza.addSauce(sauce);
        }

        pizza.halfBake();

        for (Pizza.Topping topping : pizzaOrder.getToppings()) {
            System.out.println("Valentino adding " + topping + " topping");
            pizza.addTopping(topping);
        }

        pizza.finishBaking();

        System.out.println("------");

        return pizza;
    }
}
