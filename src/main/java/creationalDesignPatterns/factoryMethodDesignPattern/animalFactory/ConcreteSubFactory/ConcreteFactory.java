package creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.ConcreteSubFactory;

import creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.ConcreteProduct.Duck;
import creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.ConcreteProduct.Tiger;
import creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.Factory.AnimalFactoryInterface;
import creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.Product.AnimalInterface;

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
