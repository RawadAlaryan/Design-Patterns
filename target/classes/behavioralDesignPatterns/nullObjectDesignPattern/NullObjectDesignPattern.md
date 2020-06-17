### Null Object Design Pattern:
- It is a Behavioral Design Pattern. 
- It encapsulates the absence of an object by providing a substitutable alternative that offers suitable default do nothing behavior. 
- It is a design for situations where "nothing will come of nothing".
	
	
### Null Object Design Pattern has the following elements:
1. Client: Main class that uses the design.
2. Abstract Object: It declares the interface for Client's collaborator.
3. Real Object: A concrete subclass of AbstractObject whose instances provide useful behavior that Client expects.
4. NullObject: It provides an interface identical to AbstractObject's so that a null object can be substituted for a real object.


### Examples and Projects:
- Project:	[Null Employee.](/src/main/java/behavioralDesignPatterns/nullObjectDesignPattern/projectNullEmployee/Main/Main.java)
