package pizza;

import builder.PizzaOrderBuilder;
import order.PizzaOrder;

public class MyOwnPizza extends Pizza {

    private MyOwnPizza() {

    }

    public static class Order implements PizzaOrderBuilder<MyOwnPizza> {

        private PizzaOrder<MyOwnPizza> order;

        public Order() {
            order = new PizzaOrder(MyOwnPizza::new);
        }

        @Override
        public PizzaOrder<MyOwnPizza> order() {
            return order;
        }

        public PizzaOrderBuilder<MyOwnPizza> addSauce(Pizza.Sauce sauce) {
            order.addSauce(sauce);
            return this;
        }

        public PizzaOrderBuilder<MyOwnPizza> addTopping(Pizza.Topping topping) {
            order.addTopping(topping);
            return this;
        }
    }

    @Override
    public void eat() {
        System.out.println("Customer eating its own made-up pizza");
    }
}
