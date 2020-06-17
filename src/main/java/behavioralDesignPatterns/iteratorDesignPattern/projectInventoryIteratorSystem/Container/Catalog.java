package behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Container;

import behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Iterator.IteratorInterface;

public interface Catalog {
    public IteratorInterface createIterator();
}
