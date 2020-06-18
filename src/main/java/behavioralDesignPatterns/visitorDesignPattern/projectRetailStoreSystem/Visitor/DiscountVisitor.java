package behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitor;

import java.text.DecimalFormat;

import behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitable.Jacket;
import behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitable.Shirt;

public class DiscountVisitor implements Visitor{
	DecimalFormat priceDecimalFormater = new DecimalFormat("#.##");		//Format prices.
	private double discountForShirt = 0.20;
	private double discountForJacket = 0.25;
	
	public DiscountVisitor() {}
	
	@Override
	public double visit(Shirt shirt) {
		System.out.println("Shirt's Price with Discount:\t\t" + priceDecimalFormater.format(shirt.getPrice() - shirt.getPrice()*discountForShirt));
		return Double.parseDouble(priceDecimalFormater.format(shirt.getPrice() - shirt.getPrice()*discountForShirt));
	}

	@Override
	public double visit(Jacket jacket) {
		System.out.println("Jacket's Price with Discount:\t\t" + priceDecimalFormater.format(jacket.getPrice() - jacket.getPrice()*discountForJacket));
		return Double.parseDouble(priceDecimalFormater.format(jacket.getPrice() - jacket.getPrice()*discountForJacket));
	}
}
