package behavioralDesignPatterns.observerDesignPattern.projectAlarmSystem.ConcreteObserver;

import behavioralDesignPatterns.observerDesignPattern.projectAlarmSystem.Observer.AlarmListener;

public class SystemOfLights implements AlarmListener {
	@Override
    public void whenAlarmed() { System.out.println("The System of Lights received an emergency Alarm, activating Emergency Lights!"); }
}
