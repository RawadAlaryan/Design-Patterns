package behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitor;

import behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitable.Jacket;
import behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitable.Shirt;

public interface Visitor {
	public double visit(Shirt shirt);
	public double visit(Jacket jacket);
}
