package structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.Decorator;

import structuralDesignPatterns.decoratorDesignPattern.projectGiftWrappingDecorator.Component.GiftComponent;

public class GiftDecorator implements GiftComponent {
	protected GiftComponent giftComponent;
	
	public GiftDecorator(GiftComponent giftComponent) {
		this.giftComponent = giftComponent;
	}
	
	@Override
	public void packGiftComponent() {
		this.giftComponent.packGiftComponent();
	}
}

