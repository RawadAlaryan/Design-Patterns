package creationalDesignPatterns.factoryMethodDesignPattern.hamburgerStore.ConcreteProduct;

import creationalDesignPatterns.factoryMethodDesignPattern.hamburgerStore.Product.Hamburger;

public class MontrealStyleBurger extends Hamburger {

    public MontrealStyleBurger() {
        type = "Montreal Style Burger";
        sauce = "Poutine Sauce";
        buns = "Sesame Seed Buns";
    }

    @Override
    public void cook() { System.out.println("\tCooking The Montreal Style Burger"); }
}
