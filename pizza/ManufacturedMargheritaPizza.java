package exercise.pizza;

public final class ManufacturedMargheritaPizza extends Pizza {

    public ManufacturedMargheritaPizza() {
        this.addSauce(Sauce.TOMATO);
        this.addTopping(Topping.MOZZARELLA);
    }

    public void prepareDough() { }

    public void halfBake() { }

    public void finishBaking() { }

    @Override
    public void eat() {
        System.out.println("Eating a margherita pizza from a factory (bah!)");
    }
}
