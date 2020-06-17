package behavioralDesignPatterns.observerDesignPattern.projectAlarmSystem.Subject;

import behavioralDesignPatterns.observerDesignPattern.projectAlarmSystem.Observer.AlarmListener;

public interface EmergencyAlarmSystem {
    public void register(AlarmListener alarmListener);
    public void unregister(AlarmListener alarmListener);
    public void triggerAlarmForListeners();
//    public Object getUpdate(AlarmListener alarmListener);
}
