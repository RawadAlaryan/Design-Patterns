package creationalDesignPatterns.factoryMethodDesignPattern.hamburgerStore.ConcreteProduct;

import creationalDesignPatterns.factoryMethodDesignPattern.hamburgerStore.Product.Hamburger;

public class TorontoStyleBurger extends Hamburger {

    public TorontoStyleBurger() {
        type = "Toronto Style Burger";
        sauce = "Spicy Sauce";
        buns = "English Muffin Buns";
    }

    @Override
    public void cook() { System.out.println("\tCooking The Toronto Style Burger"); }
}
