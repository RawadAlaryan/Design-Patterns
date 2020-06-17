package behavioralDesignPatterns.mediatorDesignPattern.projectChatApplication.Mediator;

import behavioralDesignPatterns.mediatorDesignPattern.projectChatApplication.Colleague.User;

public interface ChatMediator {
    public void sendMessage(String msg, User user);
    void addUser(User user);
}


