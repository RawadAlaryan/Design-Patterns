package behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Visitable;



import behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Visitor.Visitor;

public interface Visitable {
    public void accept(Visitor visitor);
}
