package creationalDesignPatterns.factoryMethodDesignPattern.projectAnimalFactory.ConcreteProduct;

import creationalDesignPatterns.factoryMethodDesignPattern.projectAnimalFactory.Product.AnimalInterface;

public class Tiger implements AnimalInterface {
	@Override
	public void Speak() {
		System.out.println("Tiger says Halum-Halum");
	}
}
