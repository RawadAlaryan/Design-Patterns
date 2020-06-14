package StructuralDesignPatterns;
/**
Composite Design Pattern:
	It is a Structural Design Pattern. 
	It is a tree structure of simple and composite objects. It is a group of objects with common functionality.
	Compose objects into tree structures to represent whole-part hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
	Recursive composition "Directories contain entries, each of which could be a directory."
	It is used for tree and hierarchy structures.
	1-to-many "has a" up the "is a" hierarchy.		
	A system that uses Composite Design Pattern might use the Visitor Design Pattern to perform operations on components of the composition.
	Composite Design Pattern may use the Chain of Responsibility Design Pattern to let components access global properties.
	
	In Composite Design Pattern we have the following elements:
		1. Component: 			Interface or an Abstract class which is a super-type for all set of classes
		2. Composite: 			Class that defines a concrete implementation of Component and holds instances of other child components.
		3. Leaf: 						A leaf represents a non-composite type i.e. it isn’t composed of other components.

Advantages of Composite Design Pattern:
	Easy to add new kinds of components.	

Composite Design Pattern vs Decorator Design Pattern:
	Both rely on recursive composition to organize an open-ended number of objects.
	Decorator is designed to add responsibilities to objects without sub-classing.
	Composite focuses on structuring classes so that related objects are treated uniformly.
	Decorator and Composite Design Patterns are often used together.
		
Project:	Composite Design Pattern Menu Design.
Project:	Composite Design Pattern Company Hierarchy.
*/
public class CompositeDesignPattern {		}
