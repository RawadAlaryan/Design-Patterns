package structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.ConcreteDecorator;

import structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.Component.GiftComponent;
import structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.Decorator.GiftDecorator;

public class RedWrapper extends GiftDecorator {
	 
    public RedWrapper(GiftComponent giftComponent) {
        super(giftComponent);
    }
 
    @Override
    public void packGiftComponent() {
        super.packGiftComponent();
        System.out.print("\tAdding a Red Wrapper to the Gift.");
    }
}
