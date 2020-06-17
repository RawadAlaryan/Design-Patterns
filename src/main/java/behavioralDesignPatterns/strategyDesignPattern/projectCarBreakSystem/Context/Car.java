package behavioralDesignPatterns.strategyDesignPattern.projectCarBreakSystem.Context;

import behavioralDesignPatterns.strategyDesignPattern.projectCarBreakSystem.Strategy.BrakeSystem;

public abstract class Car {
	private BrakeSystem brakeSystem;
	private String type;

    public Car(BrakeSystem brakeSystem, String type) {
      this.brakeSystem = brakeSystem;
      this.type = type;
    }

    public void setBrakeBehavior(BrakeSystem brakeSystem) {
        this.brakeSystem = brakeSystem;
    }
    
    public void applyBrake() { 
    	System.out.print("The Car " + type + " has ");
    	brakeSystem.brake(); 
    }
}
