package exercise.pizza;

import exercise.builder.PizzaBuilder;
import exercise.builder.PizzaOrderBuilder;
import exercise.order.PizzaOrder;

public class Margherita extends Pizza {

    private Margherita() {

    }

    public static class Order implements PizzaOrderBuilder<Margherita> {

        private PizzaOrder<Margherita> order;

        public Order() {
            order = new PizzaOrder(Margherita::new);
            order.addSauce(Sauce.TOMATO);
            order.addTopping(Topping.MOZZARELLA);
        }

        @Override
        public PizzaOrder<Margherita> order() {
            return order;
        }
    }

    public static class Luigi implements PizzaBuilder<Margherita> {

        private Margherita pizza;

        public Luigi() {
            pizza = new Margherita();
        }

        @Override
        public PizzaBuilder<Margherita> prepareDough() {
            pizza.prepareDough();
            return this;
        }

        @Override
        public PizzaBuilder<Margherita> addSauce() {
            System.out.println("Luigi adding sauce");
            pizza.addSauce(Sauce.TOMATO);
            return this;
        }

        @Override
        public PizzaBuilder<Margherita> addTopping() {
            System.out.println("Luigi adding topping");
            pizza.addTopping(Topping.MOZZARELLA);
            return this;
        }

        @Override
        public Margherita bake() {
            System.out.println("Baking a Margherita pizza");
            return pizza;
        }
    }

    @Override
    public void eat() {
        System.out.println("Customer eating a Margherita pizza");
    }
}