package structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.ConcreteDecorator;

import structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.Component.IceCreamComponent;
import structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.Decorator.IceCreamFlavorDecorator;

public class StrawberryFlavor extends IceCreamFlavorDecorator {
	private double strawberryCost = 1.5;
	
    public StrawberryFlavor(IceCreamComponent iceCreamComponent) { super(iceCreamComponent); }

    @Override
    public double costOfIceCreamComponent() {
    	return  strawberryCost + super.costOfIceCreamComponent();
    }
}
