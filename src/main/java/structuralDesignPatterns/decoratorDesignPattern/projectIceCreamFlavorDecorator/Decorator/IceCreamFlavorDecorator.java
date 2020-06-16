package structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.Decorator;

import structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.Component.IceCreamComponent;

public class IceCreamFlavorDecorator implements IceCreamComponent {

    private IceCreamComponent iceCreamComponent;
    
	public IceCreamFlavorDecorator(IceCreamComponent iceCreamComponent) {
        this.iceCreamComponent = iceCreamComponent;
    }
    
    @Override
    public double costOfIceCreamComponent() {
        return this.iceCreamComponent.costOfIceCreamComponent();
    }
}
