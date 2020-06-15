package creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.AbstractFactory;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.AbstractProduct.CPU;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.AbstractProduct.Memory;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.ConcreteFactory.AMDToolkit;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectManufacturingToolkit.ConcreteFactory.IntelToolkit;

public abstract class AbstractFactory {
	public static enum Architecture { INTEL, AMD }
	private static final IntelToolkit INTEL_TOOLKIT = new IntelToolkit();
    private static final AMDToolkit AMD_TOOLKIT = new AMDToolkit();

    //Returns a concrete factory object that is an instance of the concrete factory class appropriate for the given architecture.
    public static AbstractFactory getFactory(Architecture architecture) {
        AbstractFactory factory = null;
        switch (architecture) {
            case INTEL:
                factory = INTEL_TOOLKIT;
                break;
            case AMD:
                factory = AMD_TOOLKIT;
                break;
        }
        return factory;
    }

    public abstract CPU createCPU();

    public abstract Memory createMemory();
}
