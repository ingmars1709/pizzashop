package exercise;

import exercise.factory.MargheritaPizzaFactory;
import exercise.factory.OnionAndTunaPizzaFactory;
import exercise.factory.PizzaFactory;
import exercise.strategy.PizzaMaker;
import exercise.strategy.Valentino;
import exercise.director.Director;
import exercise.pizza.*;

import java.util.Arrays;
import java.util.List;

public class PizzaShop {

    public static void main(String[] args) {

        final Director director = new Director(new Margherita.Luigi(), new OnionAndTuna.Mario(), new Valentino());

        for (Pizza pizza : director.getAllKindsOfPizzaByBuilding()) {
            pizza.eat();
        }

        System.out.println("######");

        director.getMargherita().eat();
        director.getOnionAndTuna().eat();

        System.out.println("######");

        director.getMargheritaFromOrder();
        director.getOnionAndTunaFromOrder();
        director.getMyOwnPizzaFromOrder();

        System.out.println("######");

        PizzaMaker pizzaMaker = director.getPhasedBakedPizzaMaker();
        pizzaMaker.forOrder(new Margherita.Order().order()).eat();

        System.out.println("######");

        manufacturePizzas();
    }

    private static void manufacturePizzas() {

        final List<PizzaFactory> factories = Arrays.asList(MargheritaPizzaFactory.getInstance(), OnionAndTunaPizzaFactory.getInstance());

        for (PizzaFactory factory : factories) {
            factory.manufacturePizza().eat();
        }
    }
}
