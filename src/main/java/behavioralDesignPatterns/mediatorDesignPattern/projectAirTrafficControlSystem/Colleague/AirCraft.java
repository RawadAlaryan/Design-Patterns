package behavioralDesignPatterns.mediatorDesignPattern.projectAirTrafficControlSystem.Colleague;

import behavioralDesignPatterns.mediatorDesignPattern.projectAirTrafficControlSystem.Mediator.ATCMediator;

public abstract class AirCraft {
    protected ATCMediator mediator;
    protected String name;

    public AirCraft(ATCMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String msg);
    public abstract void receiveMessage(String msg);
}
