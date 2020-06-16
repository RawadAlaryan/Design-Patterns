package structuralDesignPatterns.adapterDesignPattern.projectAreaCalculator.Main;

import structuralDesignPatterns.adapterDesignPattern.projectAreaCalculator.Adaptee.AreaCalculatorInterface;
import structuralDesignPatterns.adapterDesignPattern.projectAreaCalculator.ConcreteAdapter.AreaCalculatorAdapter;

//Adapter Design Pattern Area Calculator (Using Object Adapter with Composition).
//System.out.println("Client uses an AreaCalculatorAdapter instead of using an AreaCalculatorInterface.
public class Main {
    public static void main (String [] args) {
    	System.out.println("Adapter Design Pattern Area Calculator (Using Object Adapter with Composition).");
    	System.out.println("Client uses an AreaCalculatorAdapter instead of using an AreaCalculatorInterface:\n");

        Triangle triangle = new Triangle(20, 10);

        AreaCalculatorInterface areaCalculatorAdapter = new AreaCalculatorAdapter(triangle);

        System.out.println("Area of Triangle is: " + areaCalculatorAdapter.getArea(null));
    }
}
