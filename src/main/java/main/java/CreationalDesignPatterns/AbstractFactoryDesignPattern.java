package CreationalDesignPatterns;
/**
Abstract Factory Design Pattern:
	It is a Creational Design Pattern. 
	It creates an instance of several families of classes, by providing an interface for creating families of related or dependent objects without specifying their concrete classes.
	A hierarchy that encapsulates: many possible "platforms", and the construction of a suite of "products".
	It is a factory of factories. It provides an interface for creating families of related objects without specifying their concrete classes.
	The methods of Abstract Factory are implemented as Factory methods.
	It is used when a system should be independent of how its products are created, composed and represented.
	It is used when we deal with multiple factories/ families of factories. Each family of related objects is designed (usually implemented as Singleton) to be used together.
	It is used when we want to provide a class library of products, where we reveal their interfaces not their implementations.
	The "new "operator is considered harmful. It delegates the responsibility of object instantiation t another object via composition.
	
	In AbstractFactory Design Pattern Class has the following	elements:
		1. AbstractFactory.
		2. ConcreteFactory.
		3. AbstractProduct.
		4. ConcreteProduct.

Advantages of Abstract Factory Design Pattern:
	Isolates clients from concrete implementation classes.
	Support a complete family of products.
	Promotes consistency among products.

Disadvantages of Abstract Factory Design Pattern:
	Hard to support new kinds of products.

Project:	Abstract Factory Design Pattern Manufacturing Toolkit.
Project:	Abstract Factory Design Pattern Shapes and Colors.
Project:	Abstract Factory Design Pattern Movie Production.
*/
public class AbstractFactoryDesignPattern {		}
