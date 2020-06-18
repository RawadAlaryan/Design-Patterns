package behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Main;

import behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitable.Jacket;
import behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitable.Shirt;
import behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitor.DiscountVisitor;
import behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitor.TaxVisitor;

//Visitor Design Pattern Retail Store System.
//Retail Store using a TaxVisitor class to visit the Visitables(Shirt, Jacket) to modify the prices with a tax.
public class Main {
	public static void main(String[] args) {
		System.out.println("Visitor Design Pattern Retail Store System.");
		System.out.println("Retail Store using a TaxVisitor class to visit the Visitables(Shirt, Jacket) to modify the prices with a tax:\n");
		
		Shirt shirt = new Shirt(24.99);
		System.out.println("Shirt's Price without Tax:\t" + shirt.getPrice());
		
		Jacket jacket = new Jacket(49.99);
		System.out.println("Jacket's Price without Tax:\t" + jacket.getPrice());
		
		System.out.println("\nAdding Tax to Shirt and Jacket using a TaxVisitor class:");
		TaxVisitor taxVisitor = new TaxVisitor();
		shirt.accept(taxVisitor);
		jacket.accept(taxVisitor);
		
		System.out.println("\nAdding Discount to Shirt and Jacket using DiscountVisitor class:");
		DiscountVisitor discountVisitor = new DiscountVisitor();
		shirt.accept(discountVisitor);
		jacket.accept(discountVisitor);
	}
}
