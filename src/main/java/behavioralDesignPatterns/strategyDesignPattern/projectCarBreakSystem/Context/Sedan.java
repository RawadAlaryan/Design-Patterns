package behavioralDesignPatterns.strategyDesignPattern.projectCarBreakSystem.Context;

import behavioralDesignPatterns.strategyDesignPattern.projectCarBreakSystem.ConcreteStrategy.SimpleBrakeSystem;

public class Sedan extends Car {
    public Sedan() {
        super(new SimpleBrakeSystem(), "Sedan");
    }
}
