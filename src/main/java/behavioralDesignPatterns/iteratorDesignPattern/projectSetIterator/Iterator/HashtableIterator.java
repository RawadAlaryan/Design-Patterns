package behavioralDesignPatterns.iteratorDesignPattern.projectSetIterator.Iterator;

import java.util.Enumeration;
import java.util.NoSuchElementException;

import behavioralDesignPatterns.iteratorDesignPattern.projectSetIterator.Container.IntegerHashtable;

public class HashtableIterator {
	private IntegerHashtable integerHashtable;
    private Enumeration<Integer> e;
    private Integer current;

    public HashtableIterator(IntegerHashtable integerHashtable) { this.integerHashtable = integerHashtable; }

    public void first() {
        e = integerHashtable.getHashtable().keys();
        next();
    }

    public boolean isDone() { return current == null; }

    public int currentItem() { return current; }

    public void  next() {
        try { current = (Integer)e.nextElement(); } 
        catch (NoSuchElementException e) { current = null; 
        }
    }
}
