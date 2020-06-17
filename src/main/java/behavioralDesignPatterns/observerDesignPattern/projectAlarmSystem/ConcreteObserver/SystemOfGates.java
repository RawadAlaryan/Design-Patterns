package behavioralDesignPatterns.observerDesignPattern.projectAlarmSystem.ConcreteObserver;

import behavioralDesignPatterns.observerDesignPattern.projectAlarmSystem.Observer.AlarmListener;

public class SystemOfGates implements AlarmListener {
    @Override
	public void whenAlarmed() { System.out.println("The System of Gates received an emergency Alarm, activating Emergency Gates!"); }
}
