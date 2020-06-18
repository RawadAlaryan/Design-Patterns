package behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitable;

import behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitor.Visitor;

public class Jacket implements Visitable {
	private double price;
	
	public Jacket(double price) { this.price = price; }
	
	public double getPrice() { return this.price; }

	@Override
	public double accept(Visitor visitor) { return visitor.visit(this); }
}
