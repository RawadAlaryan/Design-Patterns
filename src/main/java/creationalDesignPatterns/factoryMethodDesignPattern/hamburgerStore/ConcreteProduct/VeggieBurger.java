package creationalDesignPatterns.factoryMethodDesignPattern.hamburgerStore.ConcreteProduct;

import creationalDesignPatterns.factoryMethodDesignPattern.hamburgerStore.Product.Hamburger;

public class VeggieBurger extends Hamburger {
	
	public VeggieBurger() {
        type = "Veggie Burger";
        sauce = "Vegan Sauce";
        buns = "Gluten-Free Buns";
    }
    
    @Override
    public void cook() { System.out.println("\tCooking The Veggie Burger"); }
	
}
