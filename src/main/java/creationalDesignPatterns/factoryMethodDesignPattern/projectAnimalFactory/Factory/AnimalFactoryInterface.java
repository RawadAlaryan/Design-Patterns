package creationalDesignPatterns.factoryMethodDesignPattern.projectAnimalFactory.Factory;

import creationalDesignPatterns.factoryMethodDesignPattern.projectAnimalFactory.Product.AnimalInterface;

public abstract class AnimalFactoryInterface {
	public abstract AnimalInterface GetAnimalType(String type) throws Exception;
}
