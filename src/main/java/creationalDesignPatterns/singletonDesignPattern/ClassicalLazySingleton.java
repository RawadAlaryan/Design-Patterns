package creationalDesignPatterns.singletonDesignPattern;
/**
Classical-Singleton (Lazy-Instantiation):
	It is one of the Singleton Design Pattern implementations.
	It does not have Multithreading Support, so it is not multi-thread safe.
	It supports Lazy Instantiation. 
	It is not recommended.
*/

//Implementation works only for a single-threaded application.
public class ClassicalLazySingleton {
	private int data = 0;
	
	//Unique Static Instance Member Variable:
	private static ClassicalLazySingleton singletonObj;
	
	//Private Constructor:
	private ClassicalLazySingleton(){	}
	
	//Instance Getter for retrieving the only Instance - Lazy Instantiation/Creation:
	public static ClassicalLazySingleton getInstance() {
		if(singletonObj == null) { singletonObj = new ClassicalLazySingleton(); }
		return singletonObj;
	}
	
    public void setData(int myData) { data = myData; }
    public int getData() { return data; }
}
