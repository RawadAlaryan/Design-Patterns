package behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Visitable;

import behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Visitor.Visitor;

public class CD implements Visitable {
    private double price;
    private double weight;

    public CD(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public void accept(Visitor visitor) { visitor.visit(this); }
    
    public double getPrice() { return price; }
    
    public double getWeight() { return weight; }
}
