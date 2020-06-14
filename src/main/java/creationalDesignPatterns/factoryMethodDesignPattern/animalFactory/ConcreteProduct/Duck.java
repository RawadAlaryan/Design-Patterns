package creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.ConcreteProduct;

import creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.Product.AnimalInterface;

public class Duck implements AnimalInterface {
    @Override
    public void Speak(){ System.out.println("Duck says Pack-pack"); }
}
