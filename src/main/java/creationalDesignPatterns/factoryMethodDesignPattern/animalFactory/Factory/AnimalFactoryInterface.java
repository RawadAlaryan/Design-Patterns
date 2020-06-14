package creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.Factory;

import creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.Product.AnimalInterface;

public abstract class AnimalFactoryInterface {
	public abstract AnimalInterface GetAnimalType(String type) throws Exception;
}
