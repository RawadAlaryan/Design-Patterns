package creationalDesignPatterns.singletonDesignPattern;
/**
Double Check Locking Singleton:
	It is one of the Singleton Design Pattern implementations.
	It has Multithreading Support, therefore it is multi-thread-safe.
	It has better performance due to using a synchronized-block inside getInstance() method.
	It supports Lazy Instantiation for a volatile instance. 
*/

//Implementation with Double-Check Locking with Synchronization-Block strategy, it works for a multi-threaded application. Better Performance.
public class DoubleCheckLockingSingleton {
	private int data = 0;
	
    //Unique Static Volatile Instance Member Variable:
	private static volatile DoubleCheckLockingSingleton singletonObj;

	//Private Constructor:
	private DoubleCheckLockingSingleton(){	}
	    
	//Synchronized Double-Check Instance Getter for retrieving the only instance - Lazy Instantiation/Creation:
	public static DoubleCheckLockingSingleton getInstance() {
		if(singletonObj == null) {
			//Synchronized Block:
			synchronized(DoubleCheckLockingSingleton.class) {    
				if(singletonObj == null) { singletonObj = new DoubleCheckLockingSingleton(); }
			}
		}
		return singletonObj;
	}
	
    public void setData(int myData) { data = myData; }
    public int getData() { return data; }
}

