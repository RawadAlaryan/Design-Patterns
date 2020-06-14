package creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.ConcreteProduct;

import creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.Product.AnimalInterface;

public class Tiger implements AnimalInterface {
	@Override
	public void Speak() {
		System.out.println("Tiger says Halum-Halum");
	}
}
