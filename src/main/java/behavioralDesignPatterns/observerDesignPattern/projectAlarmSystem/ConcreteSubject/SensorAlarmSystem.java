package behavioralDesignPatterns.observerDesignPattern.projectAlarmSystem.ConcreteSubject;

import java.util.ArrayList;
import java.util.List;

import behavioralDesignPatterns.observerDesignPattern.projectAlarmSystem.Observer.AlarmListener;
import behavioralDesignPatterns.observerDesignPattern.projectAlarmSystem.Subject.EmergencyAlarmSystem;

public class SensorAlarmSystem implements EmergencyAlarmSystem{
    private List<AlarmListener> alarmListeners = new ArrayList<AlarmListener>();

    @Override
    public void register(AlarmListener alarmListener) { alarmListeners.add(alarmListener); }

    @Override
    public void unregister(AlarmListener alarmListener) { alarmListeners.remove(alarmListener); } 
    
    @Override
    public void triggerAlarmForListeners() {
        for (AlarmListener alarmListener : alarmListeners) { alarmListener.whenAlarmed(); }
    }
}
