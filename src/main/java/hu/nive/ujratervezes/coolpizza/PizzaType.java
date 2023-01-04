package hu.nive.ujratervezes.coolpizza;

public enum PizzaType {
    SMALL(100, 0.9), NORMAL(150, 1.0), BIG(200, 1.1);

    private final int basePrice;
    private final double toppingMultiplier;

    PizzaType(int basePrice, double toppingMultiplier) {
        this.basePrice = basePrice;
        this.toppingMultiplier = toppingMultiplier;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public double getToppingMultiplier() {
        return toppingMultiplier;
    }
}
