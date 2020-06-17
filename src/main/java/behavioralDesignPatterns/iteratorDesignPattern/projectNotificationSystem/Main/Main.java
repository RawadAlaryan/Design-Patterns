package behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.Main;

import behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.ConcreteAggregate.NotificationCollection;

//Iterator Method Design Pattern Notification System.
public class Main {

    public static void main(String [] args) {
    	System.out.println("Iterator Method Design Pattern Notification System:\n");
    	
        NotificationCollection notificationCollection = new NotificationCollection();
        NotificationBar notificationBar = new NotificationBar(notificationCollection);
        notificationBar.printNotifications();
    }
}
