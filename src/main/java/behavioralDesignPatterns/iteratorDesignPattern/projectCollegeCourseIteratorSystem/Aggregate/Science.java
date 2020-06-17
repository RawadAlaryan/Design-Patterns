package behavioralDesignPatterns.iteratorDesignPattern.projectCollegeCourseIteratorSystem.Aggregate;

import java.util.LinkedList;

import behavioralDesignPatterns.iteratorDesignPattern.projectCollegeCourseIteratorSystem.Iterator.IteratorInterface;
import behavioralDesignPatterns.iteratorDesignPattern.projectCollegeCourseIteratorSystem.Iterator.ScienceIterator;

public class Science implements SubjectInterface {
    private LinkedList<String> subjects;

    public Science()  {
        subjects = new LinkedList<String>();
        subjects.addLast("Maths");
        subjects.addLast("Comp. Sc.");
        subjects.addLast("Physics");
    }

    @Override
    public IteratorInterface createIterator()  { return new ScienceIterator(subjects); }
}
