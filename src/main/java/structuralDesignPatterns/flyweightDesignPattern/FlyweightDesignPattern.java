package StructuralDesignPatterns;
/**
Flyweight Design Pattern:
	It is a Structural Design Pattern. 
	It is a fine-grained virtual instance of an Object used for efficient sharing.
	The Motif GUI strategy of replacing heavy-weight widgets with light-weight gadgets.
	It uses sharing to support a large number of objects efficiently. It is used to reduce the number of objects created to increase performance.
	This will reduce the memory usage which is crucial for low-memory devices (mobile devices and embedded systems).		
	It tries to use existing similar objects by storing them. It creates a new object when no matching object is found.
	Flyweight objects are shared and immutable (can not be modified once they have been constructed).
	We use the Flyweight Design Pattern when an application uses a large number of objects.
	We use the Flyweight Design Pattern when storage costs are high.
	In Java JDK; valueOf() method uses cached objects. Java String Pool class also uses Flyweight Deign Pattern. 
	
	Intrinsic State vs Extrinsic State: 
		Intrinsic State/Properties: Data and properties are stored in the Flyweight object and they are sharable.
		Extrinsic State/Properties: Data and properties depend on the Flyweight object's context and they are not sharable.
		
	In Flyweight Design Pattern we have the following elements:
		1. Flyweight Factory: Interface through which flyweight objects can be handled.
		2. Concrete Flyweight: Classes that implement the Flyweight interface. They are sharable.
		3. Client.

Advantages of Flyweight Design Pattern:
	Reduce number of object instances at runtime; saves memory.
	Centralizes all the virtual objects in one single location.

Disadvantages of Flyweight Design Pattern:
	Single, logical instances of the class will not be able to behave independently from other instances.
		
Project:	Flyweight Design Pattern Shape Factory.
Project:	Flyweight Design Pattern Robot Factory.
Project:	Flyweight Design Pattern CounterStrike. (Game Factory for Players).
*/
public class FlyweightDesignPattern {	}
