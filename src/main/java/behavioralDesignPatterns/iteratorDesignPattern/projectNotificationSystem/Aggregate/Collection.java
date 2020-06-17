package behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.Aggregate;

import behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.Iterator.Iterator;

public interface Collection {
    public Iterator createIterator();
}
