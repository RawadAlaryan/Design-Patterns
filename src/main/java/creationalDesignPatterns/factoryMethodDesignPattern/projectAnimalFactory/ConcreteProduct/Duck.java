package creationalDesignPatterns.factoryMethodDesignPattern.projectAnimalFactory.ConcreteProduct;

import creationalDesignPatterns.factoryMethodDesignPattern.projectAnimalFactory.Product.AnimalInterface;

public class Duck implements AnimalInterface {
	@Override
	public void Speak() {
		System.out.println("Duck says Pack-pack");
	}
}
