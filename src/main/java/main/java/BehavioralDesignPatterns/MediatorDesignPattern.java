package BehavioralDesignPatterns;
/**
Mediator Design Pattern:
	It is a Behavioral Design Pattern.
	It defines an object that represents communication between classes that interact with each other.
	It centralizes complex communications and control between related objects.
	Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
	It promote the many-to-many relationships between interacting peers to "full object status".
	Mediator Design Pattern is used to centralize communication between objects.
	Java JDK uses Mediator Design in: java.util.Timer scheduleXXX() method and Concurrency Executor execute() method, java.lang.reflect.Method invoke() method, Java Message Service JMS. 
	
	In Mediator Design Pattern, we have the following elements:
		1. Mediator:					Interface or an abstract class defining the contract for communication among clients.
		2. ConcreteMediator: 	Class that implements the Mediator contract; it is aware of all colleagues and their inter-communications. Communications among colleagues happen only through a Mediator.
		3. Colleague: 					Interface or an abstract class representing components of our system that communicate via a Mediator.
		4. ConcreteColleague: 	Classes that implement the Colleague interface and are willing to interact with one another.

Advantages of Mediator Design Pattern:
	Increase reusabilty of objects supported by the mediator.
	Simplify maintenance of the system by centralizing the logic control.
		
		
Project:	Mediator Design Pattern Pattern Air Traffic Control ATC System.
Project:	Mediator Design Pattern Pattern Chat Application.
Project:	Mediator Design Pattern Pattern Auction Application.
*/
public class MediatorDesignPattern {		}
