package structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.ConcreteDecorator;

import structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.Component.IceCreamComponent;
import structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.Decorator.IceCreamFlavorDecorator;

public class VanillaFlavor extends IceCreamFlavorDecorator{
	private double vanillaCost = 1.0;
	
    public VanillaFlavor(IceCreamComponent iceCreamComponent) { super(iceCreamComponent); }

    @Override
    public double costOfIceCreamComponent() {
        return vanillaCost + super.costOfIceCreamComponent();
    }
}
