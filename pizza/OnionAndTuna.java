package exercise.pizza;

import exercise.builder.PizzaBuilder;
import exercise.builder.PizzaOrderBuilder;
import exercise.order.PizzaOrder;

public class OnionAndTuna extends Pizza {

    private OnionAndTuna() {

    }

    public static class Order implements PizzaOrderBuilder<OnionAndTuna> {

        private PizzaOrder<OnionAndTuna> order;

        public Order() {
            order = new PizzaOrder(OnionAndTuna::new);
            order.addSauce(Pizza.Sauce.TOMATO);
            order.addTopping(Topping.MOZZARELLA);
            order.addTopping(Topping.TUNA);
            order.addTopping(Topping.ONION);
        }

        @Override
        public PizzaOrder<OnionAndTuna> order() {
            return order;
        }
    }

    public static class Mario implements PizzaBuilder<OnionAndTuna> {

        private OnionAndTuna pizza;

        public Mario() {
            pizza = new OnionAndTuna();
        }

        @Override
        public PizzaBuilder<OnionAndTuna> prepareDough() {
            pizza.prepareDough();
            return this;
        }

        @Override
        public PizzaBuilder<OnionAndTuna> addSauce() {
            System.out.println("Mario adding sauce");
            pizza.addSauce(Sauce.TOMATO);
            return this;
        }

        @Override
        public PizzaBuilder<OnionAndTuna> addTopping() {
            System.out.println("Mario adding topping");
            pizza.addTopping(Topping.MOZZARELLA);
            pizza.addTopping(Topping.TUNA);
            pizza.addTopping(Topping.ONION);

            return this;
        }

        @Override
        public OnionAndTuna bake() {
            System.out.println("Baking an Onion and Tuna pizza");
            return pizza;
        }
    }

    @Override
    public void eat() {
        System.out.println("Customer eating an Onion and Tuna pizza");
    }
}
