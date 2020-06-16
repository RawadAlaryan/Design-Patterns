package structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.ConcreteDecorator;

import structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.Component.GiftComponent;
import structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.Decorator.GiftDecorator;

public class BlueRibbon extends GiftDecorator {
 
    public BlueRibbon(GiftComponent giftComponent) {
        super(giftComponent);
    }
 
    @Override
    public void packGiftComponent() {
        super.packGiftComponent();
        System.out.print("\tAdding a Blue Ribbon to the Gift.");
    }
}
