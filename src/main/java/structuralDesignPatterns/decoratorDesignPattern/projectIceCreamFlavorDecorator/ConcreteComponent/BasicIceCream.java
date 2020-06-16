package structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.ConcreteComponent;

import structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.Component.IceCreamComponent;

public class BasicIceCream implements IceCreamComponent {

    public BasicIceCream() { 
    	System.out.println("Creating a Basic Ice-Cream!");
    }

    @Override
    public double costOfIceCreamComponent() { return 0.50; }
}
