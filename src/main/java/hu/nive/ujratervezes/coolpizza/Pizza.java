package hu.nive.ujratervezes.coolpizza;

import java.util.List;

public class Pizza {
    private PizzaType type;
    private List<Topping> toppings;

    public Pizza(PizzaType type, List<Topping> toppings) {
        this.type = type;
        this.toppings = toppings;
    }

    public PizzaType getType() {
        return type;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public double getPrice(){
        return type.getBasePrice() + toppings.stream().mapToDouble(t -> t.getPrice() * type.getToppingMultiplier()).sum();
    }

    public boolean isSpicy(){
        return toppings.stream().anyMatch(Topping::isSpicy);
    }
}
