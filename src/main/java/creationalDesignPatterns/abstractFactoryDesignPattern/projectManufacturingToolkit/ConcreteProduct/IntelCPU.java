package creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.ConcreteProduct;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.AbstractProduct.CPU;

public class IntelCPU extends CPU {
	@Override
	public String toString() { return "\tIntel CPU Created."; }
}
