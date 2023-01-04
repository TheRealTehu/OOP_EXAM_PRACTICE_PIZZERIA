package hu.nive.ujratervezes.coolpizza;

import java.util.List;

public class BigPizza extends Pizza{

    public BigPizza(Topping topping1,Topping topping2,Topping topping3,Topping topping4) {
        super(PizzaType.BIG, List.of(topping1,topping2,topping3,topping4));
    }
}
