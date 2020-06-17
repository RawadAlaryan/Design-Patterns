package behavioralDesignPatterns.mediatorDesignPattern.projectChatApplication.ConcreteColleague;

import behavioralDesignPatterns.mediatorDesignPattern.projectChatApplication.Colleague.User;
import behavioralDesignPatterns.mediatorDesignPattern.projectChatApplication.Mediator.ChatMediator;

public class UserImpl extends User {
    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name+": Sending Message:\t\t"+msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message:\t\t"+msg);
    }
}
