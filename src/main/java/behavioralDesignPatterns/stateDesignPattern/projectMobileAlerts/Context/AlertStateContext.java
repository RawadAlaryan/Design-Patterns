package behavioralDesignPatterns.stateDesignPattern.projectMobileAlerts.Context;

import behavioralDesignPatterns.stateDesignPattern.projectMobileAlerts.ConcreteState.Vibration;
import behavioralDesignPatterns.stateDesignPattern.projectMobileAlerts.State.MobileAlertState;

public class AlertStateContext {
    private MobileAlertState currentState;

    public AlertStateContext() { currentState = new Vibration(); }		//Default state.

    public void setState(MobileAlertState state) { currentState = state; }

    public void alert() { currentState.alert(); }
}