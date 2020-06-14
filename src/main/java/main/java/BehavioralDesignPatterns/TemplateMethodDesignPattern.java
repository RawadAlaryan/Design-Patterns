package BehavioralDesignPatterns;
/**
Template Method Design Pattern:
	It is a Behavioral Design Pattern.
	It defines the skeleton of an algorithm and it defers the implementation of the algorithm to a subclass.
	Super class / Base class declares an algorithm - called template algorithm - as 'placeholder', and derived Sub classes implement the placeholder.
	It lets sub-classes redefine certain steps of an algorithm without changing the algorithms structure. 
	Template Method is used prominently in frameworks.
	In Java JDK; methods in InputStream, OutputStream, Reader, Writer classes. the JFrame class.
	
	In Template Method Design Pattern, we have the following elements:
		1. AbstractClass (Template):		contains the Template method that defines the skeleton of an algorithm.
		2. ConcreteSubClass:		one or many classes that implement the abstract operations that are called when the template method needs.

Methods Comparison:
	1. Concrete Methods: Standard complete methods.
	2. Abstract Methods: Methods that contain no implementation. They must be implemented in sub-classes.
	3. Hook Methods: Methods that may contain a default implementation, may be overwritten in some sub-classes. 
	4. Template Method: A method that calls any other methods in order to describe the algorithm. template method should be final to avoid overwriting it. 

Project:	Template Method Design Pattern Essay Writing Template.
Project:	Template Method Design Pattern Game Play Template.
Project:	Template Method Design Pattern House Building Template.
Project:	Template Method Design Pattern Order Process Template.
*/
public class TemplateMethodDesignPattern {	}
