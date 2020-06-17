package behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.Main;

import behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.ConcreteObserver.Subscriber;
import behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.ConcreteSubject.Blog;
import behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.ConcreteSubject.Post;
import behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.Observer.Observer;

//Observer Design Pattern Email Subscriber List System.
//Subscribers are Observers for Changes in Blogs that publish Posts.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Observer Design Pattern Email Subscriber List System.");
    	System.out.println("Subscribers are Observers for Changes in Blogs that publish Posts.\n");
    	
    	Blog blog = new Blog("BlogTitle", "BlogAuthor");
    	System.out.println("Blog is Created with the title:\t" + blog.getBlogTitle() + "\n");

    	Observer james = new Subscriber("James");
    	Observer selena = new Subscriber("Selena");

    	james.subscribeTo(blog);
    	selena.subscribeTo(blog);
    	System.out.println();
    	
    	Post post = new Post("Observer Design Pattern is Awesome!");
    	blog.publish(post);
    }
}
