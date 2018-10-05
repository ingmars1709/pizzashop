import decorator.PlainPizza;
import decorator.WithOnion;
import decorator.WithTomatoSauce;
import decorator.WithTuna;
import director.Director;
import factory.MargheritaPizzaFactory;
import factory.OnionAndTunaPizzaFactory;
import pizza.Margherita;
import pizza.OnionAndTuna;
import pizza.Pizza;
import strategy.PizzaMaker;
import strategy.Valentino;

import java.util.stream.Stream;

public class PizzaShop {

    public static void main(String[] args) {

        final Director director = new Director(new Margherita.Luigi(), new OnionAndTuna.Mario(), new Valentino());

        director.getAllKindsOfPizzaByBuilding().stream().forEach(Pizza::eat);

        printSeparator();

        director.getMargherita().eat();
        director.getOnionAndTuna().eat();

        printSeparator();

        director.getMargheritaFromOrder();
        director.getOnionAndTunaFromOrder();
        director.getMyOwnPizzaFromOrder();

        printSeparator();

        PizzaMaker pizzaMaker = director.getPhasedBakedPizzaMaker();
        pizzaMaker.forOrder(new Margherita.Order().order()).eat();

        printSeparator();

        manufacturePizzas();

        printSeparator();

        decoratePizzas();
    }

    private static void printSeparator() {
        System.out.println("######");
    }

    private static void decoratePizzas() {
        decorator.Pizza pizzaWithTomatoTunoOnion = new WithTuna(new WithOnion(new WithTuna(new WithTomatoSauce(new PlainPizza()))));

        System.out.println("Toppings of decorated pizza: "+ pizzaWithTomatoTunoOnion.getToppings());
        System.out.println("Sauces of decorated pizza: "+ pizzaWithTomatoTunoOnion.getSauces());
        System.out.println("Cost of decorated pizza: "+ pizzaWithTomatoTunoOnion.getCost());
    }

    private static void manufacturePizzas() {
        Stream.of(MargheritaPizzaFactory.getInstance(), OnionAndTunaPizzaFactory.getInstance()).forEach(f -> f.manufacturePizza().eat());
    }
}
