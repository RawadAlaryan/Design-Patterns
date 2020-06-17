package behavioralDesignPatterns.strategyDesignPattern.projectCarBreakSystem.ConcreteStrategy;

import behavioralDesignPatterns.strategyDesignPattern.projectCarBreakSystem.Strategy.BrakeSystem;

public class ABSBrakeSystem implements BrakeSystem{
	@Override
	public void brake() { System.out.println("Brake with ABS applied."); }
}
