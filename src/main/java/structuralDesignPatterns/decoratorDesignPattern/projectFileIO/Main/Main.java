package structuralDesignPatterns.decoratorDesignPattern.projectFileIO.Main;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import structuralDesignPatterns.decoratorDesignPattern.projectFileIO.ConcreteDecorator.LowerCaseInputStream;

//Decorator Design Pattern File IO.
//Reading a stream of characters and making them lower-case using a LowerCase Decorator.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Decorator Design Pattern File IO.");
    	System.out.println("Reading a stream of characters and making them lower-case using a LowerCase Decorator:\n");
    	
    	
    	StringBuffer inputStringBuffer = new StringBuffer("This Is A Stream Of Characters.");
    	System.out.println("Input Stream: \n" + inputStringBuffer);
    	int c;
    	System.out.println("\nOutput Stream:");
    	byte[] bytes = inputStringBuffer.toString().getBytes();
        try {
            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((c = in.read()) >= 0) { System.out.print((char) c); }
            in.close();
        }
        catch (IOException ioe) { ioe.printStackTrace(); }
    }
}
