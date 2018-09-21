package order;

import pizza.Pizza;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

public class PizzaOrder<T extends Pizza> {

    private final Supplier<T> pizzaTypeMaking;
    private Set<Pizza.Sauce> sauces;
    private Set<Pizza.Topping> toppings;

    public PizzaOrder(Supplier<T> pizzaTypeMaking) {
        this.sauces = new HashSet<>();
        this.toppings = new HashSet<>();
        this.pizzaTypeMaking = pizzaTypeMaking;
    }

    public void addSauce(Pizza.Sauce sauce) {
        this.sauces.add(sauce);
    }

    public void addTopping(Pizza.Topping topping) {
        this.toppings.add(topping);
    }

    public Set<Pizza.Sauce> getSauces() {
        return sauces;
    }

    public Set<Pizza.Topping> getToppings() {
        return toppings;
    }

    public Supplier<T> getPizzaTypeMaking() {
        return pizzaTypeMaking;
    }
}