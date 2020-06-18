package behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Visitor;

import behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Visitable.Book;
import behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Visitable.CD;
import behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Visitable.DVD;

public interface Visitor {
    public void visit(Book book);
    public void visit(CD cd);
    public void visit(DVD dvd);
    public double getTotalPostage();
}
