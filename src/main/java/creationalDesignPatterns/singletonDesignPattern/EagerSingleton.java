package creationalDesignPatterns.singletonDesignPattern;
/**
Eager Singleton:	
	It is one of the Singleton Design Pattern implementations.
	It has Multithreading Support, therefore it is multi-thread-safe.
	It supports Eager Instantiation/Creation. 
*/
//Implementation with Eager-Instantiation strategy.
public class EagerSingleton {
	private int data = 0;
	
	//Instance Member Variable:
	private static EagerSingleton singletonObj = new EagerSingleton();

	//Private Constructor:
	private EagerSingleton(){	}
	    
	//Instance-Getter Method for retrieving the only instance - Eager Instantiation/Creation:
	public static EagerSingleton getInstance() { return singletonObj; }
	
    public void setData(int myData) { data = myData; }
    public int getData() { return data; }
}
