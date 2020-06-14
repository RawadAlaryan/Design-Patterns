### Factory Method Design Pattern:
It is a popular Creational Design Pattern.<br/>
It uses factory-methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created.<br/>
Factories handle the details of object creation.<br/>
It defines an Interface or Abstract Class for creating objects by calling the Factory-Method but lets the subclasses decide how to instantiate its objects. Each subclass must define its Factory-Method.<br/>
It is used in Java JDK:	Calendar.getInstance()		Wrapper Classes valueOf()		Class.forName()		DriverManager.getConnection() NumberFormat class, ResourceBundle class, SAXParserFactory class.<br/>
This design is used when a class needs to instantiate a subclass of another class, but does not know which one.<br/>
It creates objects without exposing the creation logic to the client. It is a way of encapsulating the instantiations of concrete types.<br/> 
Factories are highly used in frameworks; e.g. Spring Framework.<br/>
It uses inheritance and relies on a subclass to handle the desired object instantiation.<br/>
	
			
### In Factory Method Design Pattern, we have the following elements:
1. Factory: Interface for creating an object - "Creator".
2. ConcreteSubFactory: also called "ConcreteCreator".
3. Product.
4. ConcreteProduct.


### Advantages of Factory Method Design Pattern:
	Decoupling the business logic of creation a class from the actual logic of the class.<br/>
	Promotes the approach of coding to an interface rather than to an implementation.<br/>
	Provides abstraction between implementation and client classes through inheritance.<br/>
	Connects parallel class hierarchies.<br/>


### Disadvantages of Factory Method Design Pattern:
	Clients might have to subclass the Creator class just to create a particular concrete object.<br/>
	Makes code more difficult to read code behind abstractions.<br/>
	Can be classed as anti-pattern when it is incorrectly used.<br/>
	Making too many objects can decrease performance.<br/>

	
#### Factory Method Design Pattern can be implemented in many techniques:
	[1. Factory Method Implementation with Abstract Creator (Strict Technique).](/FactoryMethodImplementationWithAbstractCreator.java)		 	
	2. Factory Method Implementation with Concrete Creator.										
	3. Factory Method Implementation with Static Method Creator.								


#### Examples and Projects:	
- Project:	Factory Method Design Pattern Hamburger Store.
- Project:	Factory Method Design Pattern Vehicle Store.
- Project:	Factory Method Design Pattern Animal Factory.

