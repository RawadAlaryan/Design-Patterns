package behavioralDesignPatterns.mediatorDesignPattern.projectChatApplication.Main;

import behavioralDesignPatterns.mediatorDesignPattern.projectChatApplication.Colleague.User;
import behavioralDesignPatterns.mediatorDesignPattern.projectChatApplication.ConcreteColleague.UserImpl;
import behavioralDesignPatterns.mediatorDesignPattern.projectChatApplication.ConcreteMediator.ChatMediatorImpl;
import behavioralDesignPatterns.mediatorDesignPattern.projectChatApplication.Mediator.ChatMediator;

//Mediator Design Pattern Pattern Chat Application.
public class Main {
    public static void main(String[] args) {
        System.out.println("Mediator Design Pattern Pattern Chat Application.\n");
        
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Jason");
        User user2 = new UserImpl(mediator, "Jennifer");
        User user3 = new UserImpl(mediator, "Lucy");
        User user4 = new UserImpl(mediator, "Juan");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
