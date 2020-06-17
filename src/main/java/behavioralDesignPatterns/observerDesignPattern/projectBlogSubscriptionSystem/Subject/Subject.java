package behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.Subject;

import java.util.ArrayList;
import java.util.List;

import behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.ConcreteObserver.Subscriber;
import behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.ConcreteSubject.Post;
import behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.Observer.Observer;

public abstract class Subject {
    private String subjectName;
    private List<Observer> observers = new ArrayList<Observer>();
    
    public Subject(String subjectName) { this.subjectName = subjectName; }
    
    public void register(Observer observer) {
        this.observers.add(observer);
        System.out.println(((Subscriber)observer).getName() + " has subscribed to " + this.subjectName + ".");
    }
    
    public void unregister(Observer observer) {
        if(this.observers.contains(observer)) { this.observers.remove(observer); }
    }

    public void notifyAllObservers() {
        for(Observer observer : observers) { observer.update(); }
    }

	public abstract Post getRecentPost();
}
