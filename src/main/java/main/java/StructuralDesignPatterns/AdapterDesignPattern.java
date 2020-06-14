package StructuralDesignPatterns;
/**
Adapter Design Pattern:
	It is a Structural Design Pattern. 
	It converts an interface of a class into another interface that the client expects. It works as a bridge between two incompatible interfaces.
	It is used to connect the legacy or third-party code/interface to a similar functionality through a different interface.
	It converts the interface of a class into another interface the clients expect and accept. Client Classes avoid incompatible interfaces.
	It is used when client expects an object of a specific type and we have a third-party API offering the same functionality but through an incompatible interface.
	It is also popularly known as a wrapper as it wraps an existing code with a new interface making it compatible for the client.
	It is used when we need to use several existing subclasses, but it is impractical to adapt their interfaces.
	In Java JDK:	Arrays.asList()				Reader = InputStreamReader(InputStream)		Writer = OutputStreamReader(OutputStream)  
										
	In Adapter Design Pattern we have the following elements:
		1. Client or Target: Class that wants to use the Adaptee from third-party library or the external system.
		2. Adaptee: Class in the third-party library or the external system that we want to use.
		3. AdapterInterface: Also known as "Target Interface"Interface desired by the Client to use.
		4. AdapterConcrete: Class sits between the Client and the Adaptee and implements the Target Interface.

Adapter Design Pattern can be implemented using two techniques:
	1. Using Object Adapter with Composition. Preferred for Java Programming Language.
				Advantage: It adapts an Adaptee class and any of its subclasses.
	2. Using Class Adapter with multiple-Inheritance. Java does not support inheritance. But possible by Interfaces.
				Advantage: It does not need to re-implement its entire Adaptee. It can override the behavior of an Adaptee.
		
Project:	Adapter Design Pattern Shape Adapters.
Project:	Adapter Design Pattern Socket Adapter.
Project:	Adapter Design Pattern Inventory System (with Adapter for adding items from third-party stores).
Project:	Adapter Design Pattern Area Calculator.	(Using Object Adapter with Composition).
Project:	Adapter Design Pattern Integer Value.		(Using Class Adapter with multiple-Interfaces). 
*/
public class AdapterDesignPattern {	}
