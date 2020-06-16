package structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.ConcreteComponent;

import structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.Component.GiftComponent;

public class BasicGift implements GiftComponent {
	@Override
	public void packGiftComponent() {
		System.out.print("Packing Current Gift:\t\t");
        System.out.print("\tPutting it in a box\t\t");
    }
}
