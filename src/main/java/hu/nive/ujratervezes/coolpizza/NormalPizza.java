package hu.nive.ujratervezes.coolpizza;

import java.util.List;

public class NormalPizza extends Pizza{
    public NormalPizza(Topping topping) {
        super(PizzaType.NORMAL, List.of(topping));
    }

    public NormalPizza(Topping topping1, Topping topping2) {
        super(PizzaType.NORMAL, List.of(topping1,topping2));
    }

    public NormalPizza(Topping topping1, Topping topping2,Topping topping3) {
        super(PizzaType.NORMAL, List.of(topping1,topping2,topping3));
    }
}
