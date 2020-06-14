package creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.Main;

import creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.ConcreteSubFactory.ConcreteFactory;
import creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.Factory.AnimalFactoryInterface;
import creationalDesignPatterns.factoryMethodDesignPattern.animalFactory.Product.AnimalInterface;

//Factory Method Design Pattern Animal Factory.
//Concrete Animal Factory defines a Factory Method for creating different Animals (Duck, Tiger).
public class Main {
    public static void main(String [] args) throws Exception {
		System.out.println("Factory Method Design Pattern Animal Factory.");
		System.out.println("Concrete Animal Factory defines a Factory Method for creating different Animals (Duck, Tiger).:\n");
		
        AnimalFactoryInterface animalFactory = new ConcreteFactory();

        AnimalInterface duckType = animalFactory.GetAnimalType("Duck");
        duckType.Speak();

        AnimalInterface tigerType = animalFactory.GetAnimalType("Tiger");
        tigerType.Speak();

        //This will throw an exception.
		//AnimalInterface lionType = animalFactory.GetAnimalType("Lion");
        //lionType.Speak();	
    }
}
