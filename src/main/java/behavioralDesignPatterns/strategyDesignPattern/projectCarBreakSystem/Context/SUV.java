package behavioralDesignPatterns.strategyDesignPattern.projectCarBreakSystem.Context;

import behavioralDesignPatterns.strategyDesignPattern.projectCarBreakSystem.ConcreteStrategy.ABSBrakeSystem;

public class SUV extends Car {
    public SUV() {
        super(new ABSBrakeSystem(), "SUV");
    }
}
