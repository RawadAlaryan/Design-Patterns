package structuralDesignPatterns.flyweightDesignPattern.projectCounterStrikeFactory.ConcreteFlyweight;

import structuralDesignPatterns.flyweightDesignPattern.projectCounterStrikeFactory.FlyweightFactory.Player;

public class Terrorist implements Player {
    //Intrinsic attribute:
    private final String TASK;

    // extrinsic attribute
    private String weapon;

    public Terrorist() { TASK = "Plant a bomb"; }

    public void assignWeapon(String weapon) { this.weapon = weapon; }

    public void mission() { System.out.println("Terrorist with weapon " + weapon + " : Task is " + TASK); }
}
