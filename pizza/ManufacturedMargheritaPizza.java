package pizza;

public final class ManufacturedMargheritaPizza extends Pizza {

    public ManufacturedMargheritaPizza() {
        this.addSauce(Sauce.TOMATO);
        this.addTopping(Topping.MOZZARELLA);
    }

    @Override
    public void prepareDough() { }

    @Override
    public void halfBake() { }

    @Override
    public void finishBaking() { }

    @Override
    public void eat() {
        System.out.println("Eating a margherita pizza from a factory (bah!)");
    }
}
