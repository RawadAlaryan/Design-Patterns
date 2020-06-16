package structuralDesignPatterns.flyweightDesignPattern.projectRobotFactory.FlyweightFactory;

public interface RobotInterface {
    void print();

    //Extrinsic data is passed as arguments
    void setColor(String colorOfRobot);
}
