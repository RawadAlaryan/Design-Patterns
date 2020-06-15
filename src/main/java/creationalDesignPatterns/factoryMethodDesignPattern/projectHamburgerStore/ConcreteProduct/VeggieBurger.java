package creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.ConcreteProduct;

import creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.Product.Hamburger;

public class VeggieBurger extends Hamburger {
	
	public VeggieBurger() {
        type = "Veggie Burger";
        sauce = "Vegan Sauce";
        buns = "Gluten-Free Buns";
    }
    
    @Override
    public void cook() { System.out.println("\tCooking The Veggie Burger"); }
	
}
