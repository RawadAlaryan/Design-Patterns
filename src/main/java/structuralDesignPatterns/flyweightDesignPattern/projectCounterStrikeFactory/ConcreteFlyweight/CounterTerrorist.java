package structuralDesignPatterns.flyweightDesignPattern.projectCounterStrikeFactory.ConcreteFlyweight;

import structuralDesignPatterns.flyweightDesignPattern.projectCounterStrikeFactory.FlyweightFactory.Player;

public class CounterTerrorist implements Player {
    //Intrinsic attribute:
    private final String TASK;

    // extrinsic attribute
    private String weapon;

    public CounterTerrorist() { TASK = "Diffuse a bomb"; }

    public void assignWeapon(String weapon) { this.weapon = weapon; }

    public void mission() { System.out.println("Counter Terrorist with weapon " + weapon + " : Task is " + TASK); }
}
