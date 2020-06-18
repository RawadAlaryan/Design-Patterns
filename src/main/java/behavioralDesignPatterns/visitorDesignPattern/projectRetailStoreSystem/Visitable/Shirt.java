package behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitable;

import behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitor.Visitor;

public class Shirt implements Visitable {
	private double price;
	
	public Shirt(double price) { this.price = price; }
	
	public double getPrice() { return this.price; }

	@Override
	public double accept(Visitor visitor) { return visitor.visit(this); }
}
