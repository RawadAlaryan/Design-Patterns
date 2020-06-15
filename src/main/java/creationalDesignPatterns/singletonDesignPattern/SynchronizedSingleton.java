package creationalDesignPatterns.singletonDesignPattern;
/**
Synchronized Singleton:
	It is one of the Singleton Design Pattern implementations.
	It has Multithreading Support, therefore it is multi-thread-safe.
	It supports Lazy Instantiation.
	It has a poor performance, because of using a synchronized method for the getInstance() method.
*/

//Implementation with Synchronization-Method strategy, it works for a multi-threaded application. Poor Performance.
public class SynchronizedSingleton {
	private int data = 0;
	
	//Instance Member Variable:
	private static SynchronizedSingleton singletonObj;

	//Private Constructor:
	private SynchronizedSingleton(){	}
	    
	//Synchronized Instance-Getter Method for retrieving the only instance:
	public static synchronized SynchronizedSingleton getInstance() {
		if(singletonObj == null) { singletonObj = new SynchronizedSingleton(); }
		return singletonObj;
	}
	
    public void setData(int myData) { data = myData; }
    public int getData() { return data; }
}

