package behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitable;

import behavioralDesignPatterns.visitorDesignPattern.projectRetailStoreSystem.Visitor.Visitor;

public interface Visitable {
	public double accept(Visitor visitor);
}
