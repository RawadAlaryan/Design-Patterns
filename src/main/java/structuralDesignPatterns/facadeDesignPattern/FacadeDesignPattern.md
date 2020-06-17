### Facade Design Pattern:
- It is a Structural Design Pattern. 
- It is a single Class that represents an entire Subsystem by providing a unified interface to a set of interfaces in a subsystem. 
- Facade (means the face of a building) defines a higher-level interface that makes the subsystem easier to use.
- It is a front-facing Interface. It wraps a complicated subsystem with a simpler interface. It does not add any functionality.
- Facade is used when we want to provide a simple interface to a complex sub-system.
- Facade is used when there are many dependencies between clients and the implementation.
- It is used in Java JDK: java.util.Connection JDBC interface Class is a facade for creating DB connections.
											
										
### Facade Design Pattern has the following elements:
1. <b>Facade.</b>
2. <b>Subsystem.</b>


### Facade Design Pattern vs Adapter Design Pattern:
- If we want to use a Class that has no interface, we use an Adapter.
- If we want to simplify and unify a large complex set of interfaces, we use Facade.
- Adapter changes an interface into one that the client expects.
- Facade decouples a client from a complex system.
- Adapter wraps an object to change its interface.
- Facade wraps a set of objects for simplification purposes.
	
				
### Advantages of Facade Design Pattern:
- Shields the client from system components and its complexity.
- Supports loose coupling.
- Reduces compilation dependencies in large software systems.
- Simplifies porting systems to other platforms.


### Examples and Projects:
- Project:	[Computer System.](/src/main/java/structuralDesignPatterns/facadeDesignPattern/projectComputerSystem/Main/Main.java)
- Project:	[Library System.](/src/main/java/structuralDesignPatterns/facadeDesignPattern/projectLibrarySystem/Main/Main.java)
- Project:	[Home Theater System.](/src/main/java/structuralDesignPatterns/facadeDesignPattern/projectHomeTheaterSystem/Main/Main.java)
- Project:	[Hotel Restaurants System.](/src/main/java/structuralDesignPatterns/facadeDesignPattern/projectHotelRestaurantsSystem/Main/Main.java)
