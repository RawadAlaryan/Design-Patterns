package behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.ConcreteIterator;

import behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.Iterator.Iterator;
import behavioralDesignPatterns.iteratorDesignPattern.projectNotificationSystem.Main.Notification;

public class NotificationIterator implements Iterator {
    Notification[] notificationList;

    //Maintains current position of iterator over the array
    int pos = 0;

    //Constructor takes the array of notifiactionList are going to iterate over.
    public  NotificationIterator (Notification[] notificationList)  {
        this.notificationList = notificationList;
    }

    public Object next() {
        // return next element in the array and increment position.
        Notification notification = notificationList[pos];
        pos += 1;
        return notification;
    }

    public boolean hasNext()  {
        if (pos >= notificationList.length || notificationList[pos] == null)
            return false;
        else
            return true;
    }
}
