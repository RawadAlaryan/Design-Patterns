### Adapter Design Pattern:
- It is a Structural Design Pattern. 
- It converts an interface of a class into another interface that the client expects. It works as a bridge between two incompatible interfaces.
- It is used to connect the legacy or third-party code/interface to a similar functionality through a different interface.
- It converts the interface of a class into another interface the clients expect and accept. Client Classes avoid incompatible interfaces.
- It is used when client expects an object of a specific type and we have a third-party API offering the same functionality but through an incompatible interface.
- It is also popularly known as a wrapper as it wraps an existing code with a new interface making it compatible for the client.
- It is used when we need to use several existing subclasses, but it is impractical to adapt their interfaces.
- In Java JDK:	Arrays.asList()				Reader = InputStreamReader(InputStream)		Writer = OutputStreamReader(OutputStream)  

										
### Adapter Design Pattern has the following elements:
1. <b>Client or Target:</b> A Main Class that wants to use the Adaptee from third-party library or the external system.
2. <b>Adaptee:</b> A Class in the third-party library or the external system that we want to use.
3. <b>Adapter Interface:</b> Also known as "Target Interface". It is an Interface desired by the Client to use.
4. <b>Adapter Concrete:</b> A Class sits between the Client and the Adaptee and implements the Target Interface.


### Adapter Design Pattern can be implemented using two techniques:
1. <b>Using Object Adapter with Composition:</b> A technique preferred for Java Programming Language.<br/>
	<b>Advantage:</b> It adapts an Adaptee class and any of its subclasses.
2. <b>Using Class Adapter with multiple-Inheritance:</b> Java does not support multiple-inheritance. But possible by Interfaces.
	<b>Advantage:</b> It does not need to re-implement its entire Adaptee. It can override the behavior of an Adaptee.


### Examples and Projects:
- Project:	[Shape Adapter.](/src/main/java/structuralDesignPatterns/adapterDesignPattern/projectShapeAdapter/Main/Main.java)		
- Project:	[Electric Socket Adapter.](/src/main/java/structuralDesignPatterns/adapterDesignPattern/projectElectricSocketAdapter/Main/Main.java)
- Project:	[Inventory System.](/src/main/java/structuralDesignPatterns/adapterDesignPattern/projectInventorySystem/Main/Main.java)
- Project:	[Area Calculator.](/src/main/java/structuralDesignPatterns/adapterDesignPattern/projectAreaCalculator/Main/Main.java)
- Project:	[Integer Value.](/src/main/java/structuralDesignPatterns/adapterDesignPattern/projectIntegerValue/Main/Main.java)
