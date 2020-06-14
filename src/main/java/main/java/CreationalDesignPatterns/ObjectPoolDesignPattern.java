package CreationalDesignPatterns;
/**
Object Pool Design Pattern:
	It is a Creational Design Pattern. 
	It avoids expensive acquisition and release of resources by recycling objects that are no longer in use.
	It offers a performance boost in situations where the cost of initializing a class instance is high.
	It offers a performance boost in situations where the rate of instantiation of a class is high.
	It offers a performance boost in situations where the number of instantiations in use at any one time is low.
	The Object Pool lets others "check out" objects from its pool, when those objects are no longer needed by their processes, they are returned to the pool in order to be reused.
		
	In Object Pool Design Pattern Class has the following	elements:
		1. ReusableObject:			Class in use for a limited amount of time by Clients, then returned to ReusablePool.
		2. ReusablePool: 			Class to manage Reusable-Objects for use by Client objects.
		3. Client:							Class that uses Reusable-Objects.

Project:	Object Pool Design Pattern JDBC ConnectionPool.
*/
public class ObjectPoolDesignPattern {		}
