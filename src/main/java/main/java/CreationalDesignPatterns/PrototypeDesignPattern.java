package CreationalDesignPatterns;
/**
Prototype Design Pattern:
	It is a Creational Design Pattern.
	It uses a cloning mechanism of objects. 
	It is used when creating an instance of a given class is either expensive or complicated.
	It refers to creating a duplicate/copy object while keeping performance in mind.
	It specifies the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
	Creates one instance of a class for use as a breeder of all future instances.
	The new operator considered harmful and expensive. Therefore, Prototype will use Cloning.
	In Java JDK, it uses to make a shallow copy, and Deserialization to make a deep copy.
	It is used when a system should be independent of how its products are created, composed and represented.
	Example of Usage: Suppose we have an object that loads data from database.
	 	We need to modify the data in our program multiple times.
	 	Creating multiple copies using the "new" keyword is expensive.
	 	We can cache the object, and return a clone of it for any DB-request.
	 	This will update the database when needed, and reduce the number of database calls.  
		
	In Prototype Design Pattern Class has the following elements:
		1. Prototype: Interface for cloning.
		2. ConcretePrototype: Implements an operation for cloning.
		3. Client: Class who creates a new object by asking a prototype to clone itself.

Advantages of Prototype Design Pattern:
	Hides concrete product classes from the client.
	Let us define new behavior through object composition.

Disadvantages of Prototype Design Pattern:
	Subclass must implement the cloning system.
	Java cloneable interface has some problems.

Cloning with Cloneable Interface:
Problems with the Cloneable Interface in Java:
	Final fields can Not be modified in clone() method.
	The Cloneable interface is only a marker interface; clone() method should be implemented from programmer.
	Example of implementing the Cloneable Interface:
	public class Person implements Cloneable {
		private String name;
		private City city;	
		
		public Person clone() throws CloneNotSupportedException {
			Person clonedPerson = (Person) super.clone();
			clonedPerson.city = this.city.clone();		//Making a Deep Copy of City.
			return clonedPerson;			
		}
	}
	
Cloning with Copy Constructor:
	Advantages over Cloneable:
		Does not require any casts.
		Does not require any parent classes.
		Allows modifying final fields.

Cloning with Deserialization:
	We deserialize a serializable object to make a copy of it.
 	Final fields can Not be modified in clone() method.
 	Provides deep cloning.
 	Serialization is slower than object.clone() method.
 	Example of implementing the Serialization Interface:
 	public Person copy(Person originalPerson){
 		try {
 			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.obj"));
 			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.obj"));
 			oos.writeObject(oiginalObject);
 			return (Person) ois.readObject();
 		}
 		catch (Exception e){ throw new RuntimeException(e); }
 	}
 	
Project:	Prototype Design Pattern Cloning Objects.
Project:	Prototype Design Pattern Shape Caching.
Project:	Prototype Design Pattern Car Cloning.
*/
public class PrototypeDesignPattern {	}
