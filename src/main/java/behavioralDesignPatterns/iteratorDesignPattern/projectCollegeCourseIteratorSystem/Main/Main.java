package behavioralDesignPatterns.iteratorDesignPattern.projectCollegeCourseIteratorSystem.Main;

import behavioralDesignPatterns.iteratorDesignPattern.projectCollegeCourseIteratorSystem.Aggregate.*;
import behavioralDesignPatterns.iteratorDesignPattern.projectCollegeCourseIteratorSystem.Iterator.IteratorInterface;

//Iterator Method Design Pattern College Course Iterator System
public class Main {
    public static void print(IteratorInterface iterator)  {
        while (!iterator.isDone())  {
            System.out.println(iterator.next());
        }
    }


    public static void main(String[] args) {
        System.out.println("Iterator Method Design Pattern College Course Iterator System:\n");
        
        SubjectInterface ScienceSubject = new Science();
        SubjectInterface ArtsSubjects = new Arts();

        IteratorInterface ScienceIterator = ScienceSubject.createIterator();
        IteratorInterface ArtsIterator = ArtsSubjects .createIterator();

        System.out.println("\nScience subjects :");
        print(ScienceIterator);

        System.out.println("\nArts subjects :");
        print(ArtsIterator);
    }
}
