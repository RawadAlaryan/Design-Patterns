package behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Main;

import java.util.ArrayList;

import behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Visitable.*;
import behavioralDesignPatterns.visitorDesignPattern.projectShippingSystem.Visitor.*;

//Visitor Design Pattern Shipping System.
public class Main {
    //Normal shopping cart List of Items:
    private static ArrayList<Visitable> items = new ArrayList<Visitable>();

    public static double calculatePostage(Visitor visitor) {
        //iterate through all items
        for(Visitable item: items) {
            item.accept(visitor);
        }
        double postage = visitor.getTotalPostage();
        return postage;
    }
    
	public static void main(String[] args) {
		System.out.println("Visitor Design Pattern Shipping System.\n");
		
        //Create a bunch of visitors (Book, CD, and DVD):
        Visitable myBook = new Book(8.52, 1.05);
        Visitable myCD = new CD(18.52, 3.05);
        Visitable myDVD = new DVD(6.53, 4.02);

        //Add each vistor to the array list:
        items.add(myBook);
        items.add(myCD);
        items.add(myDVD);

        Visitor visitor = new USPostageVisitor();
        double myPostage = calculatePostage(visitor);
        System.out.println("The total postage for my items shipped to the US is: " + myPostage);

        visitor = new SouthAmericaPostageVisitor();
        myPostage = calculatePostage(visitor);
        System.out.println("The total postage for my items shipped to South America is: " + myPostage);
	}
}
