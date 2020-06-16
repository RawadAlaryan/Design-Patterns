package structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.ConcreteDecorator;

import structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.Component.IceCreamComponent;
import structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.Decorator.IceCreamFlavorDecorator;

public class ChocolateFlavor extends IceCreamFlavorDecorator {
	private double chocolateCost = 1.0;
	
    public ChocolateFlavor(IceCreamComponent iceCreamComponent) { super(iceCreamComponent); }

    @Override
    public double costOfIceCreamComponent() {
        return chocolateCost + super.costOfIceCreamComponent();
    }
}


