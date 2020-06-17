package behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.Observer;

import behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.Subject.Subject;

public interface Observer {
    public void update();
    public void setSubject(Subject subject);
}
