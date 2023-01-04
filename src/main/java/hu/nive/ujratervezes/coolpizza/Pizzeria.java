package hu.nive.ujratervezes.coolpizza;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pizzeria {
    private List<Pizza> pizzaList;

    public Pizzeria() {
        this.pizzaList = new ArrayList<>();
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public double calculateAveragePriceOfPizzas(){
        return pizzaList.stream().mapToDouble(Pizza::getPrice).average().orElse(0.0);
    }

    public int countSpicyPizzas(){
        return (int) pizzaList.stream().filter(Pizza::isSpicy).count();
    }

    public List<Pizza> getListOfPizzasByType(PizzaType type){
        return pizzaList.stream().filter(p -> p.getType().equals(type)).collect(Collectors.toList());
    }

    public void addNewPizza(Pizza pizza){
        pizzaList.add(pizza);
    }

    public void removePizza(Pizza pizza){
        pizzaList.remove(pizza);
    }
}
