### Factory Method Design Pattern:
- It is a popular Creational Design Pattern.
- It uses factory-methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created.
- Factories handle the details of object creation.
- It defines an Interface or Abstract Class for creating objects by calling the Factory-Method but lets the subclasses decide how to instantiate its objects. Each subclass must define its Factory-Method.
- It is used in Java JDK:	Calendar.getInstance()		Wrapper Classes valueOf()		Class.forName()		DriverManager.getConnection() NumberFormat class, ResourceBundle class, SAXParserFactory class.
- This design is used when a class needs to instantiate a subclass of another class, but does not know which one.
- It creates objects without exposing the creation logic to the client. It is a way of encapsulating the instantiations of concrete types. 
- Factories are highly used in frameworks too; e.g. Spring Framework.
- It uses inheritance and relies on a subclass to handle the desired object instantiation.
	
			
### Factory Method Design Pattern has the following elements:
1. <b>Factory:</b> Interface for creating an object. Also called the "Creator".
2. <b>Concrete SubFactory:</b> also called the "Concrete Creator".
3. <b>Product.</b>
4. <b>Concrete Product.</b>


### Advantages of Factory Method Design Pattern:
- Decoupling the business logic of creation a class from the actual logic of the class.<br/>
- Promotes the approach of coding to an interface rather than to an implementation.<br/>
- Provides abstraction between implementation and client classes through inheritance.<br/>
- Connects parallel class hierarchies.<br/>


### Disadvantages of Factory Method Design Pattern:
- Clients might have to subclass the Creator class just to create a particular concrete object.<br/>
- Makes code more difficult to read code behind abstractions.<br/>
- Can be classed as anti-pattern when it is incorrectly used.<br/>
- Making too many objects can decrease performance.<br/>

	
### Factory Method Design Pattern can be implemented in many techniques:
- [Factory Method Implementation with Abstract Creator.](/src/main/java/creationalDesignPatterns/factoryMethodDesignPattern/FactoryMethodImplementationWithAbstractCreator.java)		 	
- [Factory Method Implementation with Concrete Creator.](/src/main/java/creationalDesignPatterns/factoryMethodDesignPattern/FactoryMethodImplementationWithConcreteCreator.java)										
- [Factory Method Implementation with Static Method Creator.](/src/main/java/creationalDesignPatterns/factoryMethodDesignPattern/FactoryMethodImplementationWithStaticMethodCreator.java)								


### Examples and Projects:	
- Project:	[Hamburger Store.](/src/main/java/creationalDesignPatterns/factoryMethodDesignPattern/projectHamburgerStore/Main/Main.java)
- Project:	[Vehicle Store.](/src/main/java/creationalDesignPatterns/factoryMethodDesignPattern/projectVehicleStore/Main/Main.java)
- Project:	[Animal Factory.](/src/main/java/creationalDesignPatterns/factoryMethodDesignPattern/projectAnimalFactory/Main/Main.java)
