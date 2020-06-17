package behavioralDesignPatterns.mediatorDesignPattern.projectAirTrafficControlSystem.Mediator;

import behavioralDesignPatterns.mediatorDesignPattern.projectAirTrafficControlSystem.Colleague.AirCraft;

public interface ATCMediator {
    public void sendMessage(String msg, AirCraft airCraft);
    void addAirCraft(AirCraft airCraft);
}
