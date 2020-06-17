package behavioralDesignPatterns.mementoDesignPattern.projectRecoverySystem.CareTaker;

import java.util.ArrayList;
import java.util.List;

import behavioralDesignPatterns.mementoDesignPattern.projectRecoverySystem.Memento.Memento;

public class CareTaker {
    private List<Memento> stateList = new ArrayList<Memento>();

    public void addMemento(Memento memento) { 
    	stateList.add(memento); 	
    	System.out.println("\tMemento is Added to CareTaker List.");	
    }

    public Memento getMemento(int index) { return stateList.get(index); }
}
