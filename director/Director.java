package director;

import builder.PizzaBuilder;
import pizza.Margherita;
import pizza.MyOwnPizza;
import pizza.OnionAndTuna;
import pizza.Pizza;
import strategy.PizzaMaker;
import strategy.Valentino;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Director {

    private final PizzaBuilder<Margherita> luigi;
    private final PizzaBuilder<OnionAndTuna> mario;
    private final Valentino valentino;

    public Director(PizzaBuilder<Margherita> luigi, PizzaBuilder<OnionAndTuna> mario, Valentino valentino) {
        this.luigi = luigi;
        this.mario = mario;
        this.valentino = valentino;
    }

    public Set<Pizza> getAllKindsOfPizzaByBuilding() {
        return Stream
                .of(luigi,mario)
                .map(b -> b.prepareDough().addSauce().addTopping().bake())
                .collect(Collectors.toSet());
    }

    public Margherita getMargherita() {
        return luigi.prepareDough().addSauce().addTopping().bake();
    }

    public OnionAndTuna getOnionAndTuna() {
        return mario.prepareDough().addSauce().addTopping().bake();
    }

    public Pizza getMargheritaFromOrder() { return valentino.forOrder(new Margherita.Order().addSauce(Pizza.Sauce.BECHEMEL).addTopping(Pizza.Topping.RUCOLA).order()); }

    public Pizza getOnionAndTunaFromOrder() {
        return valentino.forOrder(new OnionAndTuna.Order().order());
    }

    public Pizza getMyOwnPizzaFromOrder() {
        return valentino.forOrder(new MyOwnPizza.Order()
                .addSauce(Pizza.Sauce.TOMATO)
                .addTopping(Pizza.Topping.RUCOLA)
                .addTopping(Pizza.Topping.PEPPERONI)
                .addTopping(Pizza.Topping.MOZZARELLA)
                .order());
    }

    public PizzaMaker getPhasedBakedPizzaMaker() {
        return valentino;
    }
}