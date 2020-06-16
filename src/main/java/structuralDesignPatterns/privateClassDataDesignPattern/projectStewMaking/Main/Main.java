package structuralDesignPatterns.privateClassDataDesignPattern.projectStewMaking.Main;

import structuralDesignPatterns.privateClassDataDesignPattern.projectStewMaking.MainClass.ImmutableStew;
import structuralDesignPatterns.privateClassDataDesignPattern.projectStewMaking.MainClass.Stew;

//Private Class Data Design Pattern Stew Making.
//Using a protected StewData to make an Immutable Stew.
public class Main {
	public static void main(String[] args) {
		System.out.println("Private Class Data Design Pattern Stew Making.");
		System.out.println("Using a protected StewData to make an Immutable Stew:\n");
		
		 //Stew is mutable:
		System.out.println("Creating a Stew:");
	    Stew stew = new Stew(2, 4, 3, 6);
	    stew.mix();
	    stew.taste();
	    stew.mix();

	    //Immutable Stew is protected with Private Class Data pattern:
	    System.out.println("\nCreating an Immutable Stew:");
	    ImmutableStew immutableStew = new ImmutableStew(2, 4, 3, 6);
	    immutableStew.mix();
	}
}
