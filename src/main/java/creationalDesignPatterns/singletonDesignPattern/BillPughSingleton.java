package creationalDesignPatterns.singletonDesignPattern;
/**
BillPugh Singleton:
	It is one of the Singleton Design Pattern implementations.
	It is used by Java.
	It has Multithreading Support, therefore it is multi-thread-safe and has good performance.
	It uses an inner static helper class. 
	It is one of the recommended Singleton Approachs.
*/
public class BillPughSingleton {
	private int data = 0;

	//Private Constructor:
	private BillPughSingleton(){	}
	    
	//Instance-Getter Method for retrieving the only instance - Eager Instantiation/Creation:
	public static BillPughSingleton getInstance() { return SingletonHelper.singletonObj; }
	
    public void setData(int myData) { data = myData; }
    public int getData() { return data; }
    
    //A Nested Inner Helper Class:
    private static class SingletonHelper {
    	//Instance Member Variable:
    	//Nested class is referenced after getInstance() is called
    	private static BillPughSingleton singletonObj = new BillPughSingleton();
    }
}
