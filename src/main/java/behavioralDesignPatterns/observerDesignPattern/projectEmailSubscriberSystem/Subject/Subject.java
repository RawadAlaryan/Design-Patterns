package behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.Subject;

import behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.Observer.Observer;

public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyObservers();
    public Object getUpdate(Observer observer);
}
