### Flyweight Design Pattern:
- It is a Structural Design Pattern. 
- It is a fine-grained virtual instance of an Object used for efficient sharing.
- The Motif GUI strategy of replacing heavy-weight widgets with light-weight gadgets.
- It uses sharing to support a large number of objects efficiently. It is used to reduce the number of objects created to increase performance.
- This will reduce the memory usage which is crucial for low-memory devices (mobile devices and embedded systems).		
- It tries to use existing similar objects by storing them. It creates a new object when no matching object is found.
- Flyweight objects are shared and immutable (can not be modified once they have been constructed).
- We use the Flyweight Design Pattern when an application uses a large number of objects.
- We use the Flyweight Design Pattern when storage costs are high.
- In Java JDK; valueOf() method uses cached objects. Java String Pool class also uses Flyweight Deign Pattern. 
	
	
### Flyweight Design Pattern has the following elements:
1. <b>Flyweight Factory:</b> Interface through which flyweight objects can be handled.
2. <b>Concrete Flyweight:</b> Classes that implement the Flyweight interface. They are sharable.
3. <b>Client:</b> The Main Class that uses the design.


### Intrinsic State vs Extrinsic State: 
- Intrinsic State/Properties: Data and properties are stored in the Flyweight object and they are sharable.
- Extrinsic State/Properties: Data and properties depend on the Flyweight object's context and they are not sharable.


### Advantages of Flyweight Design Pattern:
- Reduce number of object instances at runtime; saves memory.
- Centralizes all the virtual objects in one single location.


### Disadvantages of Flyweight Design Pattern:
- Single, logical instances of the class will not be able to behave independently from other instances.
	
	
### Examples and Projects:
- Project:	[Shape Factory.](/src/main/java/structuralDesignPatterns/flyweightDesignPattern/projectShapeFactory/Main/Main.java)		
- Project:	[Robot Factory.](/src/main/java/structuralDesignPatterns/flyweightDesignPattern/projectRobotFactory/Main/Main.java)
- Project:	[CounterStrike Factory.](/src/main/java/structuralDesignPatterns/flyweightDesignPattern/projectCounterStrikeFactory/Client/CounterStrikeClient.java)