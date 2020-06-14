package BehavioralDesignPatterns;
/**
Strategy Design Pattern:
	It is a Behavioral Design Pattern.
	It is also known as the Policy Pattern. 
	It defines a family of algorithms, encapsulate each one inside a class, and make them interchangeable by selecting an algorithm at runtime. 
	Strategy Design Pattern lets the algorithm vary independently from the Clients (Contexts) that use it.
	It captures the abstraction in an interface or an abstract class, buries the implementation details in derived classes.
	It is used in Java JDK with Comparator in the Collections.sort() method. 
	
	In Strategy Design Pattern, we have the following elements:
		1. Strategy: 					an interface defining the common operation we intend to perform.
		2. ConcreteStrategy: 		these are the implementation classes that use different algorithms to carry out the operation defined in the Strategy interface.
		3. Context: 						anything that requires changing behaviors and holds a reference to a Strategy.

Strategy Design Pattern vs. State Design Pattern:
	Strategy Design Pattern is a set f subclasses that represent steps in an algorithm.
	With Strategy Design Pattern, the Context is passed as an argument to the method without storing it.
	State Design Pattern is an alternative to putting a lot of conditionals in the context.
	With State Design Pattern, the Context contains/stores a state as an instance variable.		

Project:	Strategy Design Pattern Game Score System.
Project:	Strategy Design Pattern Online Shopping Payment System.
Project:	Strategy Design Pattern Car Break System.
*/

public class StrategyDesignPattern { }
