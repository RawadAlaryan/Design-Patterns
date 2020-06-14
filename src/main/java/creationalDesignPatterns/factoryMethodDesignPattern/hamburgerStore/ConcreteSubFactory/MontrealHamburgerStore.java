package creationalDesignPatterns.factoryMethodDesignPattern.hamburgerStore.ConcreteSubFactory;

import creationalDesignPatterns.factoryMethodDesignPattern.hamburgerStore.ConcreteProduct.CheeseBurger;
import creationalDesignPatterns.factoryMethodDesignPattern.hamburgerStore.ConcreteProduct.MontrealStyleBurger;
import creationalDesignPatterns.factoryMethodDesignPattern.hamburgerStore.ConcreteProduct.VeggieBurger;
import creationalDesignPatterns.factoryMethodDesignPattern.hamburgerStore.Factory.HamburgerStore;
import creationalDesignPatterns.factoryMethodDesignPattern.hamburgerStore.Product.Hamburger;

public class MontrealHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if (type.equals("Montreal Style Burger")) { return new MontrealStyleBurger(); }
        
        else if (type.equals("Veggie Burger")) { return new VeggieBurger(); }
        
        else if (type.equals("Cheese Burger")) { return new CheeseBurger(); }
        
        else { System.out.println("The Burger Type \"" + type + "\" is not available at this store, Sorry!");		return null; }
    }
}
