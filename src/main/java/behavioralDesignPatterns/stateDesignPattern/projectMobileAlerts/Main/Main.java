package behavioralDesignPatterns.stateDesignPattern.projectMobileAlerts.Main;

import behavioralDesignPatterns.stateDesignPattern.projectMobileAlerts.ConcreteState.Silent;
import behavioralDesignPatterns.stateDesignPattern.projectMobileAlerts.Context.AlertStateContext;

//State Design Pattern Mobile Alerts.
public class Main {
	public static void main(String[] args) {
		System.out.println("State Design Pattern Mobile Alerts.\n");
		
        AlertStateContext stateContext = new AlertStateContext();

        stateContext.alert();
        stateContext.alert();

        stateContext.setState(new Silent());

        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
	}
}
