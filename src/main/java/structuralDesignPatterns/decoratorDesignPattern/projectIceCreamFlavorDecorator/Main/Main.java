package structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.Main;

import structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.Component.IceCreamComponent;
import structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.ConcreteComponent.BasicIceCream;
import structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.ConcreteDecorator.ChocolateFlavor;
import structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.ConcreteDecorator.StrawberryFlavor;
import structuralDesignPatterns.decoratorDesignPattern.projectIceCreamFlavorDecorator.ConcreteDecorator.VanillaFlavor;

//Decorator Design Pattern IceCream Flavor Choices Picker.
//Adding IceCreamFlavors Decorators (Vanilla, Strawberry, Chocolate) to a BasicIceCream.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Decorator Design Pattern IceCream Flavor Choices Picker:");
    	System.out.println("Adding IceCreamFlavors Decorators (Vanilla, Strawberry, Chocolate) to a BasicIceCream:\n");
        IceCreamComponent basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-cream cost $ " + basicIceCream.costOfIceCreamComponent());

        //Add VanillaFlavor to the BasicIceCream order:
        IceCreamComponent vanillaFlavor = new VanillaFlavor(basicIceCream); 
        System.out.println("\tAdding Vanilla Flavor to IceCream - current cost is: $ " + vanillaFlavor.costOfIceCreamComponent() + "\n");

        //Add StrawberryFlavor to the BasicIceCream order:
        IceCreamComponent strawberryFlavor = new StrawberryFlavor(vanillaFlavor);
        System.out.println("\tAdding Strawberry Flavor to IceCream - current cost is: $ " + strawberryFlavor.costOfIceCreamComponent() + "\n");

        //Add ChocolateFlavor to the BasicIceCream order:
        IceCreamComponent chocolateFlavor = new ChocolateFlavor(strawberryFlavor);
        System.out.println("\tAdding Chocolate - current cost is: $ " + chocolateFlavor.costOfIceCreamComponent() + "\n");
    }
}
