package behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitor;

import java.text.DecimalFormat;

import behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitable.Jacket;
import behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitable.Shirt;

public class TaxVisitor implements Visitor {
	DecimalFormat priceDecimalFormater = new DecimalFormat("#.##");		//Format prices.
	private double taxForShirt = 0.10;
	private double taxForJacket = 0.15;
	
	public TaxVisitor() {}
	
	@Override
	public double visit(Shirt shirt) {
		System.out.println("Shirt's Price with Tax:\t\t" + priceDecimalFormater.format(shirt.getPrice()*taxForShirt + shirt.getPrice()));
		return Double.parseDouble(priceDecimalFormater.format(shirt.getPrice()*taxForShirt + shirt.getPrice()));
	}

	@Override
	public double visit(Jacket jacket) {
		System.out.println("Jacket's Price with Tax:\t\t" + priceDecimalFormater.format(jacket.getPrice()*taxForJacket + jacket.getPrice()));
		return Double.parseDouble(priceDecimalFormater.format(jacket.getPrice()*taxForJacket + jacket.getPrice()));
	}
}
