package creationalDesignPatterns;
/**
Factory Method Design Pattern:
	It is a popular Creational Design Pattern.
	It uses factory-methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created.
	Factories handle the details of object creation.
	It defines an Interface or Abstract Class for creating objects by calling the Factory-Method but lets the subclasses decide how to instantiate its objects. Each subclass must define its Factory-Method.
	It is used in Java JDK:	Calendar.getInstance()		Wrapper Classes valueOf()		Class.forName()		DriverManager.getConnection() NumberFormat class, ResourceBundle class, SAXParserFactory class.
	This design is used when a class needs to instantiate a subclass of another class, but does not know which one.
	It creates objects without exposing the creation logic to the client. It is a way of encapsulating the instantiations of concrete types. 
	Factories are highly used in frameworks; e.g. Spring Framework.
	It uses inheritance and relies on a subclass to handle the desired object instantiation.
			
In Factory Method Design Pattern, we have the following elements:
	1. Factory: Interface for creating an object - "Creator".
	2. ConcreteSubFactory: also called "ConcreteCreator".
	3. Product.
	4. ConcreteProduct.

Advantages of Factory Method Design Pattern:
	Decoupling the business logic of creation a class from the actual logic of the class.
	Promotes the approach of coding to an interface rather than to an implementation.
	Provides abstraction between implementation and client classes through inheritance.
	Connects parallel class hierarchies.

Disadvantages of Factory Method Design Pattern:
	Clients might have to subclass the Creator class just to create a particular concrete object.
	Makes code more difficult to read code behind abstractions.
	Can be classed as anti-pattern when it is incorrectly used.
	Making too many objects can decrease performance.
	
Factory Method Design Pattern can be implemented in many techniques:
	1. Factory Method Implementation with Abstract Creator (Strict Technique).		 	
	2. Factory Method Implementation with Concrete Creator.										
	3. Factory Method Implementation with Static Method Creator.								
	
Project:	Factory Method Design Pattern Hamburger Store.
Project:	Factory Method Design Pattern Vehicle Store.
Project:	Factory Method Design Pattern Animal Factory.
*/
public class FactoryMethodDesignPattern { 
	public static void main(String[] args) {

        
	}

}
