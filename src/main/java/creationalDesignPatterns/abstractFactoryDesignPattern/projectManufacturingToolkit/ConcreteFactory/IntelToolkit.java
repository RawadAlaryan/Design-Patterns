package creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.ConcreteFactory;


import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.AbstractFactory.AbstractFactory;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.AbstractProduct.CPU;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.AbstractProduct.Memory;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.ConcreteProduct.IntelCPU;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.ConcreteProduct.IntelMemory;

public class IntelToolkit extends AbstractFactory {
    @Override
    public CPU createCPU() { return new IntelCPU(); }

    @Override
    public Memory createMemory() { return new IntelMemory(); }
}
