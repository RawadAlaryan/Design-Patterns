package behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.ConcreteObserver;

import behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.ConcreteSubject.Post;
import behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.Observer.Observer;
import behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.Subject.Subject;

public class Subscriber implements Observer {

    private String name;
    private Subject subject;

    public Subscriber(String name) {
        this.name = name;
    }
   
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
	public Subject getSubject() { return subject; }
	public void setSubject(Subject subject) { this.subject = subject; }

	public void subscribeTo(Subject subject) {
        subject.register(this);
        this.subject = subject;
    }
    
    public void unsubscribeFrom(Subject subject) { 
        subject.unregister(this); 
        this.subject = null; 
    }
 
    @Override
    public void update() {
        if(this.subject == null) {
            System.out.println("Not yet subscribed!");
            return;
        } 
        //Get the recent published Post:
        Post recentPost = this.subject.getRecentPost();
        System.out.println(this.name + " received a new published post with the title:\t" + recentPost.getPostTitle());
    }   
}
