package behavioralDesignPatterns.mediatorDesignPattern.projectChatApplication.ConcreteMediator;

import java.util.ArrayList;
import java.util.List;

import behavioralDesignPatterns.mediatorDesignPattern.projectChatApplication.Colleague.User;
import behavioralDesignPatterns.mediatorDesignPattern.projectChatApplication.Mediator.ChatMediator;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() { this.users = new ArrayList<User>(); }

    @Override
    public void addUser(User user) { this.users.add(user); }

    @Override
    public void sendMessage(String msg, User toUser) {
        for (User user : users) {
            //Message should not be received by the user sending it.
            if(user != toUser) { user.receive(msg); }
        }
    }
}
