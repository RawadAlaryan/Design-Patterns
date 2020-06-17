### Iterator Design Pattern:
- It is a Behavioral Design Pattern.
- It traverses/iterates a container and access the container's elements sequentially.
- It provides a way to access the elements/objects of an aggregate Collection sequentially without exposing its underlying representation.
- An aggregate object (also called a container or a collection) is an object that contains other objects for the purpose of grouping those objects as a unit; such as LinkedLists and Hashtables.
- Iterator Design Pattern can work together with the Visitor Design Pattern that applies an operation to each element in the aggregate object.
- Java JDK has an Iterator Interface in package: 			java.util.Iterator.
	
	
### Iterator Design Pattern has the following elements:
1. <b>Iterator:</b> (Interface and Concrete) for accessing and traversing elements.
2. <b>Aggregate or Container:</b> (Interface and Concrete) defines an interface for creating an iterator object.
3. <b>Client:</b> The Main class that uses the iterator object. 


### Examples and Projects:
- Project:	[Inventory Iterator System.](/src/main/java/behavioralDesignPatterns/iteratorDesignPattern/projectInventoryIteratorSystem/Main/Main.java)
- Project:	[Set Iterator.](/src/main/java/behavioralDesignPatterns/iteratorDesignPattern/projectSetIterator/Main/Main.java)
- Project:	[Notification System.](/src/main/java/behavioralDesignPatterns/iteratorDesignPattern/projectNotificationSystem/Main/Main.java)
- Project:	[College Course Iterator System.](/src/main/java/behavioralDesignPatterns/iteratorDesignPattern/projectCollegeCourseIteratorSystem/Main/Main.java)