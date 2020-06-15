package creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.Main;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.AbstractFactory.AbstractFactory;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.AbstractProduct.CPU;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.AbstractProduct.Memory;

//Abstract Factory Design Pattern Manufacturing Toolkit.
//Using multiple Factory Classes to manufacture a Platform Product.
public class Main {
	public static void main(String[] args) {
		System.out.println("Abstract Factory Design Pattern Manufacturing Toolkit.");
		System.out.println("Using multiple Factory Classes to manufacture a Platform Product:\n");

		System.out.println("Manufacturing Products for INTEL Architecture Platform:");
		AbstractFactory factory = AbstractFactory.getFactory(AbstractFactory.Architecture.INTEL);
		CPU intelCPU = factory.createCPU();
		System.out.println(intelCPU);
		Memory intelMemory = factory.createMemory();
		System.out.println(intelMemory);

		System.out.println("\nManufacturing Products for AMD Architecture Platform:");
		factory = AbstractFactory.getFactory(AbstractFactory.Architecture.AMD);
		CPU amdCPU = factory.createCPU();
		System.out.println(amdCPU);
		Memory amdMemory = factory.createMemory();
		System.out.println(amdMemory);
	}
}
