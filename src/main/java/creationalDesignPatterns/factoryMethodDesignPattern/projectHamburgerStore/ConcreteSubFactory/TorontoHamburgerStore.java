package creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.ConcreteSubFactory;

import creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.ConcreteProduct.CheeseBurger;
import creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.ConcreteProduct.TorontoStyleBurger;
import creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.ConcreteProduct.VeggieBurger;
import creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.Factory.HamburgerStore;
import creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.Product.Hamburger;

public class TorontoHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if (type.equals("Toronto Style Burger")) { return new TorontoStyleBurger(); }
        
        else if (type.equals("Veggie Burger")) { return new VeggieBurger(); }
        
        else if (type.equals("Cheese Burger")) { return new CheeseBurger(); }
        
        else { System.out.println("The Burger Type \"" + type + "\" is not available at this store, Sorry!");		return null; }
    }
}
