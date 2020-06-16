package structuralDesignPatterns.flyweightDesignPattern.projectRobotFactory.FlyweightFactory;

import java.util.HashMap;
import java.util.Map;

import structuralDesignPatterns.flyweightDesignPattern.projectRobotFactory.ConcreteFlyweight.Robot;

public class RobotFactory {
    Map<String, RobotInterface> shapesMap = new HashMap<String, RobotInterface>();

    public int totalObjectsCreated() { return shapesMap.size(); }

    public RobotInterface getRobotFromFactory(String robotType) throws Exception {
        RobotInterface myRobot = null;

        if (shapesMap.containsKey(robotType)) { myRobot = shapesMap.get(robotType); } 
        else {
            switch (robotType) {
                case "King":
                    System.out.println("We do not have a King Robot.  So we are creating a King Robot now.");
                    myRobot = new Robot("King");
                    shapesMap.put("King", myRobot);
                    break;
                case "Queen":
                    System.out.println("We do not have Queen Robot. So we are creating a Queen Robot now.");
                    myRobot = new Robot("Queen");
                    shapesMap.put("Queen", myRobot);
                    break;
                default:
                    throw new Exception(" Robot Factory can create only King and Queen Robots.");
            }
        }
        return myRobot;
    }
}

