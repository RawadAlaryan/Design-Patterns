package creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.ConcreteProduct;

import creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.Product.Hamburger;

public class CheeseBurger extends Hamburger {

    public CheeseBurger() {
        type = "Cheese Burger";
        sauce = "Swiss Cheese Sauce";
        buns = "Classic Buns";
    }
    
    @Override
    public void cook() { System.out.println("\tCooking The Cheese Burger"); }
}
