package CreationalDesignPatterns;
/**
Singleton Design Pattern:
	It is a Creational Design Pattern. It is a basic and most useful design pattern. The term comes from the mathematical concept of a singleton.
	It is a class of which only a single instance can exist and is globally accessible. Single Point Of Access. 
	It restricts the instantiation of a class to one "single" instance. It is encapsulated "just-in-time initialization" or "initialization on first use". 
	This is useful when exactly one object is needed to coordinate actions across the system. 
	It is used in The Abstract factory, Builder, and Prototype Design Patterns implementations.
	In Java JDK, it is used in java.lang.Runtime and java.awt.Desktop.
	Examples: It is used as a printer spooler managing several printers in a system.
					  Singleton for a FileSystem, for a WindowManager, for an AccountingSystem, for Logging, for Driver objects, for Caching, for ThreadPool.
	A Singleton Class has many types of implementations:
		1. Classical Singleton, lazy instantiation, No-Multithreading Support.
		2. Synchronized Singleton, lazy instantiation, Multithreading Support with poor performance using synchronized getInstance() method.
		3. Double-Check Locking Creation Singleton, lazy instantiation for a volatile instance, Multithreading Support with better performance using synchronized-block inside getInstance() method.
		4. Eager Singleton, eager instantiation.
		
	In Singleton Design Pattern Class has the following	elements:
		1. Static Member Variable holding the instance of the class itself.
		2. Private Constructor to prevent another instance to be created from outside.
		3. Public Static Instance-Getter Method that returns the only instance of the class.   

Advantages Singleton Design Pattern:
	Strict control access to sole instance.
	Reduced name space.
	Permits a variable number of instances.

Disadvantages Singleton Design Pattern:
	Hinders unit testing.
	Creates hidden dependencies.
	
Singleton Design Pattern has many implementation approaches/techniques:
	Classical-Singleton (Lazy-Instantiation): It is not multi-thread safe and it is not recommended.		
	Synchronized-Singleton: It is thread-safe and effective.		
	Double-Check-Locking-Singleton: It is thread-safe and better performance.		 
	Eager-Singleton: It is thread-safe and uses less resources.
	Bill Pugh Singleton Approach: It is used by Java. It is thread-safe and has good performance. It uses an inner static helper class. Recommended Approach.

Project:	Singleton Design Pattern Different Implementations.		 
*/
public class SingletonDesignPattern { }
