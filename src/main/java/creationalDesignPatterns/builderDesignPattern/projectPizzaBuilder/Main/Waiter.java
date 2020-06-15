package creationalDesignPatterns.builderDesignPattern.projectPizzaBuilder.Main;

import creationalDesignPatterns.builderDesignPattern.projectPizzaBuilder.Builder.Pizza;
import creationalDesignPatterns.builderDesignPattern.projectPizzaBuilder.Builder.PizzaBuilder;

class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) { pizzaBuilder = pb; }

    public Pizza getPizza() { return pizzaBuilder.getPizza(); }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}

