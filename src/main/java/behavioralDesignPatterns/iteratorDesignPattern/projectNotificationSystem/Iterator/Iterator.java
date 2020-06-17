package behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.Iterator;

public interface Iterator {
    //Indicates whether there are more elements to iterator over.
    public boolean hasNext();

    //Returns the next element.
    public Object next();
}
