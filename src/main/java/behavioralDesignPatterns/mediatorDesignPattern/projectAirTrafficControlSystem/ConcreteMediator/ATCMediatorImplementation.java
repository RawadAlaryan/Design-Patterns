package behavioralDesignPatterns.mediatorDesignPattern.projectAirTrafficControlSystem.ConcreteMediator;

import java.util.ArrayList;
import java.util.List;

import behavioralDesignPatterns.mediatorDesignPattern.projectAirTrafficControlSystem.Colleague.AirCraft;
import behavioralDesignPatterns.mediatorDesignPattern.projectAirTrafficControlSystem.Mediator.ATCMediator;

public class ATCMediatorImplementation implements ATCMediator {
    private List<AirCraft> airCraftList;

    public ATCMediatorImplementation() { this.airCraftList = new ArrayList<AirCraft>(); }

    @Override
    public void sendMessage(String msg, AirCraft airCraft) {
        System.out.println("\nAircrafts Receiving Message:");
    	for (AirCraft aircraft : airCraftList) {
            //Message should  not be received by the aircraft sending the message
            if (aircraft != airCraft) { aircraft.receiveMessage(msg); }
        }
    }

    @Override
    public void addAirCraft(AirCraft airCraft) { airCraftList.add(airCraft); }
}
