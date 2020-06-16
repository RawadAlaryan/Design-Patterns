package structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.Main;

import structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.Component.GiftComponent;
import structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.ConcreteComponent.BasicGift;
import structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.ConcreteDecorator.BlueRibbon;
import structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.ConcreteDecorator.RedWrapper;

//Decorator Design Pattern Gift Wrapping Choices Picker.
//Adding Gift Decorators (Red Wrapper, Blue Ribbon) to a Basic Gift.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Decorator Design Pattern Gift Wrapping Choices Picker.");
    	System.out.println("Adding Gift Decorators (Red Wrapper, Blue Ribbon) to a Basic Gift:\n");
        GiftComponent basicGift = new BasicGift();
        System.out.println("Basic Gift:");			
        basicGift.packGiftComponent();
        System.out.println();

        //Add Red Wrapper to the BasicGift order:
        GiftComponent redWrapper = new RedWrapper(basicGift);
        System.out.println("\nAdd Red Wrapper:");
        redWrapper.packGiftComponent();
        System.out.println();
        
        //Add Blue Ribbon to the BasicGift order:
        GiftComponent blueRibbon = new BlueRibbon(redWrapper);
        System.out.println("\nAdd Blue Ribbon:");
        blueRibbon.packGiftComponent();
        System.out.println();
    }
}
