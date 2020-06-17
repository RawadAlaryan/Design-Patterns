package behavioralDesignPatterns.iteratorDesignPattern.projectSetIterator.Main;

import java.util.Enumeration;
import behavioralDesignPatterns.iteratorDesignPattern.projectSetIterator.Container.IntegerHashtable;
import behavioralDesignPatterns.iteratorDesignPattern.projectSetIterator.Iterator.HashtableIterator;

//Iterator Method Design Pattern Set Iterator.
//Hashtable uses an HashtableIterator Implementation to show Keys (Integers).
public class Main {
    public static void main(String[] args) {
        System.out.println("Iterator Method Design Pattern Set Iterator.");
    	System.out.println("Hashtable uses an HashtableIterator Implementation to show Keys (Integers):\n");
    	
        IntegerHashtable hashtable = new IntegerHashtable();
        for (int i=1; i < 10; i ++) { hashtable.add( i ); }
        
        //Our Iterator Implementation using the first(), isDone(), next(), currentItem() iterator methods:
        System.out.print( "Our Iterator Implementation:\t\t" );
        HashtableIterator iterator = hashtable.createIterator();
        for ( iterator.first();  ! iterator.isDone();  iterator.next()) {
            System.out.print( iterator.currentItem() + "  " );
        }
        
        //Java's Iterator Implementation using Enumeration:
        System.out.print( "\nJava's Iterator Implementation:\t\t" );
        for (Enumeration<Integer> e = hashtable.getHashtable().keys(); e.hasMoreElements(); ) {
        	System.out.print( e.nextElement() + "  " );
        }
        System.out.println();
    }
}
