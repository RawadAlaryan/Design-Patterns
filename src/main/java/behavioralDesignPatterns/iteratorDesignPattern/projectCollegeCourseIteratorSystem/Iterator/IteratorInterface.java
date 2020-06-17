package behavioralDesignPatterns.iteratorDesignPattern.projectCollegeCourseIteratorSystem.Iterator;

public interface IteratorInterface {
    void first();							//Reset to first element.
    String next();						//Get next element.
    boolean isDone();				//End of collection check.
    String currentItem();		//Retrieve Current Item.
}








