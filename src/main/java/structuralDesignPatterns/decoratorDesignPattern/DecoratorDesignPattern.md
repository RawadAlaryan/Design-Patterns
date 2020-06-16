### Decorator Design Pattern:
- It is a Structural Design Pattern.
- It is a way to add additional responsibilities to objects dynamically.
- It adds responsibilities using Inheritance, or by enclosing a component object called "decorator".
- It allows behaviors to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class.
- It provides a flexible alternative to sub-classing for extending functionality. 
- We can add/remove responsibilities to a system by attaching/detaching decorators.
- In Java JDK; Decorator is used in Streams in java IO packages.
- We use a decorator when extension by sub-classing is impractical.

	
### Decorator Design Pattern has the following elements:
1. Decorator.
2. Concrete Decorator.
3. Component.
4. Concrete Component.

		
### Advantages of Decorator Design Pattern:
- Adding new functionalities without disturbing the existing objects in the system.
- More flexible than static inheritance.
- Decorators can add a property twice, by simply adding same decorator twice.
		
		
### Disadvantages of Decorator Design Pattern:
- Results in a large number of small classes.
	
	
### Examples and Projects:
- Project:	[Gift Wrapping Decorator.](/src/main/java/structuralDesignPatterns/decoratorDesignPattern/projectGiftWrappingDecorator/Main/Main.java)					
- Project:	[IceCream Flavor Decorator.](/src/main/java/structuralDesignPatterns/decoratorDesignPattern/projectIceCreamFlavorDecorator/Main/Main.java)
- Project:	[File IO.](/src/main/java/structuralDesignPatterns/decoratorDesignPattern/projectFileIO/Main/Main.java)		
- Project:	[Shape Decorating.](/src/main/java/structuralDesignPatterns/decoratorDesignPattern/projectShapeDecorating/Main/Main.java)