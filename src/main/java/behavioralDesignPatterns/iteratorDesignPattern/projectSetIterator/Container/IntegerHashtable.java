package behavioralDesignPatterns.iteratorDesignPattern.projectSetIterator.Container;

import java.util.Hashtable;

import behavioralDesignPatterns.iteratorDesignPattern.projectSetIterator.Iterator.HashtableIterator;


public class IntegerHashtable {
	private Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
	
	public Hashtable<Integer, Integer> getHashtable() { return hashtable; }

	public void add(int integer) { hashtable.put(integer, integer); }

    public boolean isMember(int i) { return hashtable.containsKey(i); }

    public HashtableIterator createIterator()  { return new HashtableIterator(this); }
}
