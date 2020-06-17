package behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.Observer;

import behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.Subject.Subject;

public interface Observer {
    void update();
    public void subscribeTo(Subject subject);
}

