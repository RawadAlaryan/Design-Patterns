package behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.Main;

import behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.ConcreteAggregate.NotificationCollection;
import behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.Iterator.Iterator;

//Contains collection of notifications as an object of NotificationCollection.
public class NotificationBar {

    NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications)  {
        this.notifications = notifications;
    }

    public void printNotifications()  {
        Iterator iterator = notifications.createIterator();
        System.out.println("-------NOTIFICATION BAR------------");
        while (iterator.hasNext())   {
            Notification n = (Notification)iterator.next();
            System.out.println(n.getNotification());
        }
    }
}
