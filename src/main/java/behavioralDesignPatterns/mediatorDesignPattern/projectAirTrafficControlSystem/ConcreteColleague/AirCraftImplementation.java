package behavioralDesignPatterns.mediatorDesignPattern.projectAirTrafficControlSystem.ConcreteColleague;

import behavioralDesignPatterns.mediatorDesignPattern.projectAirTrafficControlSystem.Colleague.AirCraft;
import behavioralDesignPatterns.mediatorDesignPattern.projectAirTrafficControlSystem.Mediator.ATCMediator;

public class AirCraftImplementation extends AirCraft {

    public AirCraftImplementation (ATCMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("\t" + this.name + " : Sending Message:\t" + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg) { System.out.println("\t" + this.name + " : Received Message:\t"+msg); }
}
