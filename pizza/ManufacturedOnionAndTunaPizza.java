package pizza;

public final class ManufacturedOnionAndTunaPizza extends Pizza {

    public ManufacturedOnionAndTunaPizza() {
        this.addSauce(Sauce.TOMATO);
        this.addTopping(Topping.MOZZARELLA);
        this.addTopping(Topping.TUNA);
        this.addTopping(Topping.ONION);
    }

    @Override
    public void prepareDough() { }

    @Override
    public void halfBake() { }

    @Override
    public void finishBaking() { }

    @Override
    public void eat() {
        System.out.println("Eating an onion and tuna pizza from a factory (bah!)");
    }
}
