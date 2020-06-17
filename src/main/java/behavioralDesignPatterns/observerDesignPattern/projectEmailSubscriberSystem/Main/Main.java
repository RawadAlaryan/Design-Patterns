package behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.Main;

import behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.ConcreteObserver.EmailTopicSubscriber;
import behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.ConcreteSubject.EmailTopic;
import behavioralDesignPatterns.observerDesignPattern.projectEmailSubscriberSystem.Observer.Observer;

//Observer Design Pattern Email Subscriber List System.
//EmailTopicSubscribers are Observers for Changes in EmailTopics that post Messages.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Observer Design Pattern Email Subscriber List System.");
    	System.out.println("EmailTopicSubscribers are Observers for Changes in EmailTopics that post Messages.\n");
        //Create Subject:
    	EmailTopic emailTopic = new EmailTopic();				
    	System.out.println("Email-Topic is Created!\n");
    	
        //Create Observers:
        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");

        //Register Observers:														
        System.out.println("Registering the Observers:");
        emailTopic.register(firstObserver);
        emailTopic.register(secondObserver);
        emailTopic.register(thirdObserver);

        //Attaching Observer to Subject:
        firstObserver.setSubject(emailTopic);
        secondObserver.setSubject(emailTopic);
        thirdObserver.setSubject(emailTopic);

        //Check for Updates:
        firstObserver.update();
        secondObserver.update();
        thirdObserver.update();
        
        //Subject broadcasting and notifying Observers:
        emailTopic.postMessage("Hello Subscribers!");
        
        //Unregister Observer:
        emailTopic.unregister(firstObserver);
        
        //Subject broadcasting and notifying Observers:
        System.out.println();
        emailTopic.postMessage("Hello Subscribers!");
    }
}
