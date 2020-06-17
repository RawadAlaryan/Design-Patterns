package behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.ConcreteObserver;

import behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.Observer.Observer;
import behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.Subject.Subject;

public class EmailTopicSubscriber implements Observer {
    private String name;
    //Reference to our Subject class
    private Subject topic;

    public EmailTopicSubscriber(String name) { this.name = name; }

    public String getName() { return this.name; }
    
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) { System.out.println(name + " No new message on this topic!"); }
        else { System.out.println("\t" + name + " Retrieving message: " + msg); }
    }
    
    @Override
    public void setSubject(Subject subject) { this.topic = subject; }
}
