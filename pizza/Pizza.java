package pizza;

import java.util.HashSet;
import java.util.Set;

public abstract class Pizza {

    public enum Sauce {
        TOMATO,
        BECHEMEL
    }

    public enum Topping {
        MOZZARELLA,
        ONION,
        TUNA,
        PEPPERONI,
        RUCOLA
    }

    private Set<Sauce> sauce;
    private Set<Topping> topping;

    public Pizza() {
        this.sauce = new HashSet<>();
        this.topping = new HashSet<>();
    }

    public abstract void eat();

    public void addTopping(final Topping topping) {
        this.topping.add(topping);
    }

    public void addSauce(final Sauce sauce) {
        this.sauce.add(sauce);
    }

    public void prepareDough() {
        System.out.println("Preparing dough");
    }

    public void halfBake() { System.out.println("Half bake"); }

    public void finishBaking() {
        System.out.println("Finish baking");
    }
}