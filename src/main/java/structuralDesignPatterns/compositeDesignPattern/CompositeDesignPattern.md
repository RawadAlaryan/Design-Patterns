### Composite Design Pattern:
- It is a Structural Design Pattern. 
- It is a tree structure of simple and composite objects. It is a group of objects with common functionality.
- It composes objects into tree structures to represent whole-part hierarchies. 
- The Composite Design Pattern lets clients treat individual objects and compositions of objects uniformly.
- Recursive composition "Directories contain entries, each of which could be a directory."
	
	
### Composite Design Pattern has the following elements:
1. Component: Interface or an Abstract class which is a super-type for all set of classes.
2. Composite: Class that defines a concrete implementation of Component and holds instances of other child components.
3. Leaf: A leaf represents a non-composite type i.e. it isn’t composed of other components.


### Advantages of Composite Design Pattern:
- Easy to add new kinds of components.	


### Composite Design Pattern vs Decorator Design Pattern:
- Both rely on recursive composition to organize an open-ended number of objects.
- Decorator is designed to add responsibilities to objects without sub-classing.
- Composite focuses on structuring classes so that related objects are treated uniformly.
- Decorator and Composite Design Patterns are often used together.
	
	
### Examples and Projects:
- Project:	[Menu Design.](/src/main/java/structuralDesignPatterns/compositeDesignPattern/projectMenuDesign/Main/Main.java) 		
- Project:	[Company Hierarchy.](/src/main/java/structuralDesignPatterns/compositeDesignPattern/projectCompanyHierarchy/Main/Main.java)