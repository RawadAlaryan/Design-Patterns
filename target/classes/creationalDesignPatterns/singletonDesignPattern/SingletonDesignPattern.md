### Singleton Design Pattern:
- It is a Creational Design Pattern. 
- It is a basic and a very useful design pattern. 
- The term comes from the mathematical concept of a singleton.
- It is a class of which only a single instance can exist and is globally accessible; like a Single Point Of Access. 
- It behaves as <i>Lazy Initialization</i>. It restricts the instantiation of a class to one "single" instance which is initialization on the first use. 
- It is used in The Abstract factory, Builder, and Prototype Design Patterns implementations.


### Singleton Design Pattern Class has the following	elements:
		1. Static Member Variable holding the instance of the class itself.
		2. Private Constructor to prevent another instance to be created from outside.
		3. Public Static Instance-Getter Method that returns the only instance of the class.


### Advantages Singleton Design Pattern:
	Strict control access to sole instance.
	Reduced name space.
	Permits a variable number of instances.


### Disadvantages Singleton Design Pattern:
	Hinders unit testing.
	Creates hidden dependencies.


### Singleton Design Pattern Different Implementations.
A Singleton Class has many types of Implementations/Approaches/Techniques:
1. [Classical Singleton (Lazy-Instantiation)](/src/main/java/creationalDesignPatterns/singletonDesignPattern/ClassicalLazySingleton.java)
2. [Synchronized Singleton](/src/main/java/creationalDesignPatterns/singletonDesignPattern/SynchronizedSingleton.java) 
3. [Double-Check Locking Singleton](/src/main/java/creationalDesignPatterns/singletonDesignPattern/DoubleCheckLockingSingleton.java)
4. [Eager Singleton](/src/main/java/creationalDesignPatterns/singletonDesignPattern/EagerSingleton.java)
5. [Bill Pugh Singleton](/src/main/java/creationalDesignPatterns/singletonDesignPattern/BillPughSingleton.java)		