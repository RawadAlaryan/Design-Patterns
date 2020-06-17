package behavioralDesignPatterns.observerDesignPattern.projectAlarmSystem.Main;

import behavioralDesignPatterns.observerDesignPattern.projectAlarmSystem.ConcreteObserver.SystemOfGates;
import behavioralDesignPatterns.observerDesignPattern.projectAlarmSystem.ConcreteObserver.SystemOfLights;
import behavioralDesignPatterns.observerDesignPattern.projectAlarmSystem.ConcreteSubject.SensorAlarmSystem;

//Observer Design Pattern Alarm System.
// AlarmListeners (Gates and Lights) are Observers for Changes in SensorAlarmSystem that trigger an emergency Alarm.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Observer Design Pattern Alarm System.");
    	System.out.println("AlarmListeners (Gates and Lights) are Observers for Changes in SensorAlarmSystem that trigger an emergency Alarm.\n");
        SensorAlarmSystem sensorAlarmSystem = new SensorAlarmSystem();
        sensorAlarmSystem.register(new SystemOfGates());
        sensorAlarmSystem.register(new SystemOfLights());
        System.out.println("The Sensors System detected an emergency situation, triggering Alarm-Listeners !");
        sensorAlarmSystem.triggerAlarmForListeners();
    }
}
