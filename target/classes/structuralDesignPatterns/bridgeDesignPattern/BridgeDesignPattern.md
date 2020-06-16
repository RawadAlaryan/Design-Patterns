### Bridge Design Pattern:
- It is a Structural Design Pattern. 
- It separates an object’s interface abstraction from its implementation so that the two can vary independently.
- It decouples an abstraction from its implementation so that they can vary independently by providing a bridge structure between them.
- <b>Decoupling:</b> It is to have things behave independently from each other.
- <b>Abstraction:</b> It is how different things are related to each other conceptually.
- It is used in GUI frameworks to separate window abstraction from window implementation.		
- We use the Bridge Design Pattern when we want to avoid a permanent binding between an abstraction and its implementation.
- We use the Bridge Design Pattern when both the abstractions and their implementations should be extensible by sub-classing.								
- We use the Bridge Design Pattern when changes in the implementation of an abstraction should have no impact on clients.

											
### Bridge Design Pattern has the following elements:
1. Abstraction: It is the core of Bridge and defines the crux. It contains a reference to the implementer.
2. Implementation: Provides an implementation in terms of operations provided by the implemented interface.


### Advantages of Bridge Design Pattern:
- Decouples an implementation so that it is not bound permanently to an interface.
- Abstraction and implementation can be extended independently.
- Changes to the concrete abstraction classes do not affect the client.
		
			
### Disadvantages of Bridge Design Pattern:
- Increase in code complexity.	


### Bridge Design Pattern vs Adapter Design Pattern:
- Both promote flexibility by providing a level of indirection to another object.
- Both involve forwarding requests to another object from another interface.
- Adapter focuses on resolving incompatibilities between two existing interfaces.
- Bridge makes a link between abstractions and implementations. 
- Adapter makes things work after that they are already designed.
- Bridge makes things work before they are designed.
	
	
### Examples and Projects:
- Project:	[Vehicle Manufacturing.](/src/main/java/structuralDesignPatterns/bridgeDesignPattern/projectVehicleManufacturing/Main/Main.java)		
- Project:	[Shape Coloring.](/src/main/java/structuralDesignPatterns/bridgeDesignPattern/projectShapeColoring/Main/Main.java)