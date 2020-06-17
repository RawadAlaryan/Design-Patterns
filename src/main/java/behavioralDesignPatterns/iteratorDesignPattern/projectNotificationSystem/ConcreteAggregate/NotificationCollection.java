package behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.ConcreteAggregate;

import behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.Aggregate.Collection;
import behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.ConcreteIterator.NotificationIterator;
import behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.Iterator.Iterator;
import behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.Main.Notification;

public class NotificationCollection implements Collection {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification [] notificationList;

    public NotificationCollection() {
        notificationList = new Notification[MAX_ITEMS];
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(String str) {
        Notification notification = new Notification(str);
        if (numberOfItems >= MAX_ITEMS) { System.err.println("Full"); }
        else {
            notificationList[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() { return new NotificationIterator(notificationList); }
}