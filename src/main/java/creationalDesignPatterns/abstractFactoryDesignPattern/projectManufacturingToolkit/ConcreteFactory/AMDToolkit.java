package creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.ConcreteFactory;


import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.AbstractFactory.AbstractFactory;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.AbstractProduct.CPU;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.AbstractProduct.Memory;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.ConcreteProduct.AMDCPU;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.ConcreteProduct.AMDMemory;

public class AMDToolkit extends AbstractFactory{
    @Override
    public CPU createCPU() {
        return new AMDCPU();
    }

    @Override
    public Memory createMemory() {
        return new AMDMemory();
    }
}
