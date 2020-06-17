### Strategy Design Pattern:
- It is a Behavioral Design Pattern.
- It is also known as the Policy Pattern. 
- It defines a family of algorithms, encapsulate each one inside a class, and make them interchangeable by selecting an algorithm at runtime. 
- Strategy Design Pattern lets the algorithm vary independently from the Clients (Contexts) that use it.
- It captures the abstraction in an interface or an abstract class, buries the implementation details in derived classes.
- It is used in Java JDK with Comparator in the Collections.sort() method. 

	
### Strategy Design Pattern has the following elements:
1. <b>Strategy:</b> Interface defining the common operation we intend to perform.
2. <b>ConcreteStrategy:</b> Implementation classes that use different algorithms to carry out the operation defined in the Strategy interface.
3. <b>Context:</b> Requires changing behaviors and holds a reference to a Strategy.


### Strategy Design Pattern vs. State Design Pattern:
- Strategy Design Pattern is a set f subclasses that represent steps in an algorithm.
- With Strategy Design Pattern, the Context is passed as an argument to the method without storing it.
- State Design Pattern is an alternative to putting a lot of conditionals in the context.
- With State Design Pattern, the Context contains/stores a state as an instance variable.		


### Examples and Projects:
- Project:	[Game Score System.](/src/main/java/behavioralDesignPatterns/strategyDesignPattern/projectGameScoreSystem/Main/Main.java)
- Project:	[Online Shopping Payment System.](/src/main/java/behavioralDesignPatterns/strategyDesignPattern/projectOnlineShoppingPaymentSystem/Main/Main.java)
- Project:	[Car Break System.](/src/main/java/behavioralDesignPatterns/strategyDesignPattern/projectCarBreakSystem/Main/Main.java)