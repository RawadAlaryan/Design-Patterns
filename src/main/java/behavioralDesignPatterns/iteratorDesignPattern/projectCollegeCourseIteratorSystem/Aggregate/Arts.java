package behavioralDesignPatterns.iteratorDesignPattern.projectCollegeCourseIteratorSystem.Aggregate;

import behavioralDesignPatterns.iteratorDesignPattern.projectCollegeCourseIteratorSystem.Iterator.ArtsIterator;
import behavioralDesignPatterns.iteratorDesignPattern.projectCollegeCourseIteratorSystem.Iterator.IteratorInterface;

public class Arts implements SubjectInterface {
    private String[] subjects;

    public Arts() {
        subjects = new String[2];
        subjects[0] = "Interior Design";
        subjects[1] = "Abstract Painting" ;
    }

    public IteratorInterface createIterator() { return new ArtsIterator(subjects); }
}
