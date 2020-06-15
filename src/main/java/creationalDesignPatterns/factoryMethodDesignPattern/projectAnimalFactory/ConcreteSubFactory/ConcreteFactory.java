package creationalDesignPatterns.factoryMethodDesignPattern.projectAnimalFactory.ConcreteSubFactory;

import creationalDesignPatterns.factoryMethodDesignPattern.projectAnimalFactory.ConcreteProduct.Duck;
import creationalDesignPatterns.factoryMethodDesignPattern.projectAnimalFactory.ConcreteProduct.Tiger;
import creationalDesignPatterns.factoryMethodDesignPattern.projectAnimalFactory.Factory.AnimalFactoryInterface;
import creationalDesignPatterns.factoryMethodDesignPattern.projectAnimalFactory.Product.AnimalInterface;

public class ConcreteFactory extends AnimalFactoryInterface {
    @Override
    public AnimalInterface GetAnimalType (String type) throws Exception {
        switch(type) {
            case "Duck":		return new Duck();
            case "Tiger":		return new Tiger();
            default:			throw new Exception("Animal type: " + type + " cannot be instantiated");
        }
    }
}
