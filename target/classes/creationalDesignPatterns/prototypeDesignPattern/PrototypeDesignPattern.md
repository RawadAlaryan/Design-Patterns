### Prototype Design Pattern:
- It is a Creational Design Pattern.
- It uses a Cloning mechanism of objects. 
- It is used when creating an instance of a given class is either expensive or complicated.
- It refers to creating a duplicate/copy object while keeping performance in mind.
- It specifies the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
- The "new" operator considered harmful and expensive. Therefore, Prototype will use Cloning instead.
- In Java JDK, it uses Cloneable to make a shallow copy, and Deserialization to make a deep copy.

		
### Prototype Design Pattern has the following elements:
1. Prototype: Interface for cloning.
2. Concrete Prototype: Implements an operation for cloning.
3. Client: Main Class who creates a new object by asking a prototype to clone itself.


### Advantages of Prototype Design Pattern:
- Hides concrete product classes from the client.
- Let us define new behavior through object composition.


### Disadvantages of Prototype Design Pattern:
- Subclass must implement the cloning system.
- Java cloneable interface has some problems.


### Cloning with Cloneable Interface:
Problems with the Cloneable Interface in Java:
- Final fields can Not be modified in clone() method.
- The Cloneable interface is only a marker interface; clone() method should be implemented from programmer.
- Example of implementing the Cloneable Interface:
```java
	public class Person implements Cloneable {
		private String name;
		private City city;	
		public Person clone() throws CloneNotSupportedException {
			Person clonedPerson = (Person) super.clone();
			//Making a Deep Copy of City.
			clonedPerson.city = this.city.clone();		
			return clonedPerson;			
		}
	}
```	
	
	
### Cloning with Copy Constructor:
Advantages over Cloneable:
- Does not require any casts.
- Does not require any parent classes.
- Allows modifying final fields.


### Cloning with Deserialization:
- We deserialize a serializable object to make a copy of it.
- Final fields can Not be modified in clone() method.
- Provides deep cloning.
- Serialization is slower than object.clone() method.
- Example of implementing the Serialization Interface:
```java 	
 	public Person copy(Person originalPerson) {
 		try {
 			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.obj"));
 			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.obj"));
 			oos.writeObject(oiginalObject);
 			return (Person) ois.readObject();
 		}
 		catch (Exception e){ throw new RuntimeException(e); }
 	}
```	


### Examples and Projects:
- Project:	[Objects Cloning.](/src/main/java/creationalDesignPatterns/prototypeDesignPattern/projectObjectsCloning/Main/Main.java)
- Project:	[Shape Caching.](/src/main/java/creationalDesignPatterns/prototypeDesignPattern/projectShapeCaching/Main/Main.java)
- Project:	[Car Cloning.](/src/main/java/creationalDesignPatterns/prototypeDesignPattern/projectCarCloning/Main/Main.java)
