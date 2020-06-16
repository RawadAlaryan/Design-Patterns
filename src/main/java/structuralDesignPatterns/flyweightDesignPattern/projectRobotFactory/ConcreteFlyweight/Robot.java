package structuralDesignPatterns.flyweightDesignPattern.projectRobotFactory.ConcreteFlyweight;

import structuralDesignPatterns.flyweightDesignPattern.projectRobotFactory.FlyweightFactory.RobotInterface;

public class Robot implements RobotInterface  {
    private String robotType;
    public String colorOfRobot;

    public Robot(String robotType) { this.robotType=robotType; }
    
    public void setColor(String colorOfRobot) {
        this.colorOfRobot=colorOfRobot;
    }
    
    @Override
    public void print() { System.out.println(" This is a " +robotType+ " type robot with "+colorOfRobot+ "color"); }
}
