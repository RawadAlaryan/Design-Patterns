package structuralDesignPatterns.flyweightDesignPattern.projectRobotFactory.Main;

import java.util.Random;
import structuralDesignPatterns.flyweightDesignPattern.projectRobotFactory.ConcreteFlyweight.Robot;
import structuralDesignPatterns.flyweightDesignPattern.projectRobotFactory.FlyweightFactory.RobotFactory;

//Flyweight Design Pattern Robot Factory.
//Creating lots of Robots fast using a Robot Factory.
public class Main {
    @SuppressWarnings("unused")
	private static final String colors[] = {"Red", "Blue", "Pink", "Brown"};

    private static String getRandomColor() {
        Random r=new Random();
        /*You can supply any number of your choice in nextInt argument.
         * we are simply checking the random number generated is an even number
         * or an odd number. And based on that we are choosing the color.
         * For simplicity, we’ll use only two colors—red and green
         */
        int random=r.nextInt(20);
        if(random%2==0) { return "red"; }
        else { return "green"; }
    }
    
    public static void main(String[] args) throws Exception {
    	System.out.println("Flyweight Design Pattern Robot Factory:");
    	System.out.println("Creating lots of Robots fast using a Robot Factory:\n");
    	
        RobotFactory myfactory = new RobotFactory();
         Robot shape = null;

        /* Here we are trying to get 3 king type robots. */
        for (int i = 0; i < 3; i++) {
            shape =(Robot) myfactory.getRobotFromFactory("King");
            shape.setColor(getRandomColor());
            shape.print();
        }

        /*Here we are trying to get 3 queen type robots*/
        for (int i = 0; i < 3; i++) {
            shape =(Robot) myfactory.getRobotFromFactory("Queen");
            shape.setColor(getRandomColor());
            shape.print();
        }
        int NumOfDistinctRobots = myfactory.totalObjectsCreated();
        System.out.println("\n Finally no of Distinct Robot objects created is:\t" + NumOfDistinctRobots + " objects.");
    }
}

