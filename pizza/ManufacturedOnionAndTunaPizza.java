package pizza;

public final class ManufacturedOnionAndTunaPizza extends Pizza {

    public ManufacturedOnionAndTunaPizza() {
        this.addSauce(Sauce.TOMATO);
        this.addTopping(Topping.MOZZARELLA);
        this.addTopping(Topping.TUNA);
        this.addTopping(Topping.ONION);
    }

    public void prepareDough() { }

    public void halfBake() { }

    public void finishBaking() { }

    @Override
    public void eat() {
        System.out.println("Eating an onion and tuna pizza from a factory (bah!)");
    }
}
