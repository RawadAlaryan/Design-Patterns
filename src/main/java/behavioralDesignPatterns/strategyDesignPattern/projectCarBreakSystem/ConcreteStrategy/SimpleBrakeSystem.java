package behavioralDesignPatterns.strategyDesignPattern.projectCarBreakSystem.ConcreteStrategy;

import behavioralDesignPatterns.strategyDesignPattern.projectCarBreakSystem.Strategy.BrakeSystem;

public class SimpleBrakeSystem implements BrakeSystem{
	@Override
	public void brake() { System.out.println("Simple Brake applied."); }
}
