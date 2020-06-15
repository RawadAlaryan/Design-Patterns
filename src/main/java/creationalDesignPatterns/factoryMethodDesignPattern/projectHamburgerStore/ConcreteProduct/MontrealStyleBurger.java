package creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.ConcreteProduct;

import creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.Product.Hamburger;

public class MontrealStyleBurger extends Hamburger {

    public MontrealStyleBurger() {
        type = "Montreal Style Burger";
        sauce = "Poutine Sauce";
        buns = "Sesame Seed Buns";
    }

    @Override
    public void cook() { System.out.println("\tCooking The Montreal Style Burger"); }
}
