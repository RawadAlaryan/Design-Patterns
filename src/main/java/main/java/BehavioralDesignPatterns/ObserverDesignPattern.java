package BehavioralDesignPatterns;
/**
Observer Design Pattern:
	It is a Behavioral Design Pattern.
	It is a way of notifying change to a number of classes.
	It defines a One-to-Many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
	It encapsulate the core (or common or engine) components in a Subject abstraction, and the variable (or optional or user interface) components in an Observer hierarchy.
	It is the "View" part of Model-View-Controller.
	It is used in Java JDK in classes like Event and Listener. Distributed Event Handling Systems use the Observer Design Pattern.
	Java has its own implementation for the Observer Design Pattern in the Observer class.
	
	In Observer Design Pattern, we have the following elements:
		1. Subject: 						Also called "Provider". It maintains a list of observers, provides methods to register/unregister observers. Also, has a notifyAll() method to notify all registered observers of any state change.
		2. ConcreteSubject: 		A class extending the functionality of the Subject class, it holds a state object representing its current state. It is an immutable state object to prevent any unintentional updates by the observer.
		3. Observer: 					Also called "Observer". An Interface with an update() method which is invoked by the Subject to notify the observer of any changes in its current state.
		4. ConcreteObserver: 	Classes implementing the Observer interface, the observer objects register themselves to listen to a Subject.

Mediator Design Pattern vs Observer Design Pattern:
	Observer distributes communication by introducing Observer and Subject objects.
	Mediator encapsulates the communication between objects.
	With Observer Design Pattern, Observer and Subject cooperate together.
	With Mediator Design Pattern, the Mediator centralizes all communications with the objects.
	It is easy to make reusable Observers and Subjects than to make reusable Mediators. 

Project:	Observer Design Pattern Email Subscriber List System.
Project:	Observer Design Pattern Blog Subscription System.
Project:	Observer Design Pattern Alarm System.
*/
public class ObserverDesignPattern { }
