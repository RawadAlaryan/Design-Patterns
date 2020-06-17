package behavioralDesignPatterns.mementoDesignPattern.projectStateStoringAndRestoring.Main;

import behavioralDesignPatterns.mementoDesignPattern.projectStateStoringAndRestoring.CareTaker.Caretaker;
import behavioralDesignPatterns.mementoDesignPattern.projectStateStoringAndRestoring.Originator.Originator;

//Memento Design Pattern State Storing and Restoring.
public class Main {
    public static void main(String [] args) {
    	System.out.println("Memento Design Pattern State Storing and Restoring.\n");
    	
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("First saved State: " + originator.getState());

        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
