package creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.ConcreteProduct;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.AbstractProduct.CPU;

public class AMDCPU extends CPU {
	@Override
	public String toString() { return "\tAMD CPU Created."; }
}
