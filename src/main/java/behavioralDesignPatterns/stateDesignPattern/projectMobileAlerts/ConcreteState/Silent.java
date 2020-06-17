package behavioralDesignPatterns.stateDesignPattern.projectMobileAlerts.ConcreteState;

import behavioralDesignPatterns.stateDesignPattern.projectMobileAlerts.State.MobileAlertState;

public class Silent implements MobileAlertState {
    @Override
    public void alert() { System.out.println("silent..."); }
}

