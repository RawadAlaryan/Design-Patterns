package behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.ConcreteSubject;

import java.util.ArrayList;
import java.util.List;

import behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.ConcreteObserver.EmailTopicSubscriber;
import behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.Observer.Observer;
import behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.Subject.Subject;

public class EmailTopic  implements Subject {

    private List<Observer> observers;
    private String message;

    public EmailTopic() { this.observers = new ArrayList<>(); }

    @Override
    public void register(Observer observer) {
        if (observer == null) { throw new NullPointerException("Null object/Observer"); }
        if (!observers.contains(observer)) { System.out.println("\t" + ((EmailTopicSubscriber)observer).getName() + " has subsribed!");		observers.add(observer); }
    }

    @Override
    public void unregister(Observer observer) { observers.remove(observer); }

    @Override
    public void notifyObservers() {
    	System.out.println("Notifying all Subscribers:");
        for (Observer observer : observers) { observer.update(); }
    }

    @Override
    public Object getUpdate(Observer observer) { return this.message; }

    public void postMessage(String msg) {
        System.out.println("New Message is Posted to Email-Topic : " + msg);
        this.message = msg;
        notifyObservers();
    }
}
