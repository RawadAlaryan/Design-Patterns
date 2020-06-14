package creationalDesignPatterns.factoryMethodDesignPattern.hamburgerStore.Factory;

import creationalDesignPatterns.factoryMethodDesignPattern.hamburgerStore.Product.Hamburger;

public abstract class HamburgerStore {

    public Hamburger orderHamburger(String type){
        Hamburger burger;
        //We now user our factory-method! 
        burger =  createHamburger(type);  
        burger.prepare();
        burger.cook();
        burger.box();
        return burger;
    }

    public abstract Hamburger createHamburger(String type);
}
