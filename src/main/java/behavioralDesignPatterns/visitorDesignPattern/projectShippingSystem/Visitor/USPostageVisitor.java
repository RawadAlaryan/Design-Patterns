package behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Visitor;

import behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Visitable.Book;
import behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Visitable.CD;
import behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Visitable.DVD;

public class USPostageVisitor implements Visitor {
    private double totalPostageForCart = 0;

    //collect data about the book
    public void visit(Book book) {
        //assume we have a calculation here related to weight and price,
        // free postage for a book over 20
        if (book.getPrice() < 20.0) { totalPostageForCart += book.getWeight() * 2; }
    }

    public void visit(CD cd) {
        if (cd.getPrice() < 20.0) { totalPostageForCart += cd.getWeight() * 2.5; }
    }

    public void visit(DVD dvd) {
        if (dvd.getPrice() < 20.0) { totalPostageForCart += dvd.getWeight() * 3; }
    }

    //return the internal state
    public double getTotalPostage() { return totalPostageForCart; }
}
