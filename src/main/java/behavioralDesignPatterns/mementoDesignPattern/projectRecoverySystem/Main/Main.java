package behavioralDesignPatterns.mementoDesignPattern.projectRecoverySystem.Main;

import behavioralDesignPatterns.mementoDesignPattern.projectRecoverySystem.CareTaker.CareTaker;
import behavioralDesignPatterns.mementoDesignPattern.projectRecoverySystem.Memento.Memento;
import behavioralDesignPatterns.mementoDesignPattern.projectRecoverySystem.Originator.Originator;

//Memento Design Pattern Recovery System
//Recovery System using Memento to save a state of Originator. 
public class Main {
    public static void main(String[] args) {
    	System.out.println("Memento Design Pattern Recovery System.");
    	System.out.println("Recovery System using Memento to save a state of Originator:\n");
    	
        System.out.println("Creating a CareTaker for Mementos.");
        CareTaker careTaker = new CareTaker();

    	System.out.println("Creating an Originator with initial state: \"Initial State\".");
        Originator originator = new Originator();
        originator.setState("Initial State");
        System.out.println("Creating a Memento for Initial State.");
        Memento memento = originator.createMemento();
        careTaker.addMemento(memento);
        
        System.out.println("\nOriginator changes state to: \"Second State\".");
        originator.setState("Second State");
        System.out.println("Creating a Memento for Second State.");
        memento = originator.createMemento();
        careTaker.addMemento(memento);
        
        System.out.println("\nOriginator changes state to: \"Third State\".");
        originator.setState("Third State");
        System.out.println("Creating a Memento for Third State.");
        memento = originator.createMemento();
        careTaker.addMemento(memento);

        System.out.println("\nOriginator current state is:\t\t\t" + originator.getState());
        System.out.println("Originator restoring to Initial State with index 0.");
        memento = careTaker.getMemento(0);
        originator.setMemento(memento);
        System.out.println("Originator current state is:\t\t\t" + originator.getState());
        System.out.println("Originator restoring to Third State with index 2.");
        memento = careTaker.getMemento(2);
        originator.setMemento(memento);
        System.out.println("Originator current state is:\t\t\t" + originator.getState());
    }
}
