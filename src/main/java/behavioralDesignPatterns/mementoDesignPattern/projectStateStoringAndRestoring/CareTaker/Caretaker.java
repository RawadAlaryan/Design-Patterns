package behavioralDesignPatterns.mementoDesignPattern.projectStateStoringAndRestoring.CareTaker;

import java.util.ArrayList;
import java.util.List;

import behavioralDesignPatterns.mementoDesignPattern.projectStateStoringAndRestoring.Memento.Memento;

public class Caretaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) { mementoList.add(state); }

    public Memento get(int index) { return mementoList.get(index); }
}
