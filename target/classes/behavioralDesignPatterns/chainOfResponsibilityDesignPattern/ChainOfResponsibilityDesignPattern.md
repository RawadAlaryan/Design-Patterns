### Chain Of Responsibility Design Pattern:
- It is a Behavioral Design Pattern.
- It is 	a way of passing a request between a chain of objects.
- It avoids coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. 
- It passes the request along the chain until an object handles it. It processes a series of objects one by one - in a sequential manner.
- Launch-and-leave requests with a single processing pipeline that contains many possible handlers.
- It is used when we have multiple receivers of a request.
- Chain Design Pattern works together with Template Method Design Pattern and Command Design Pattern.
- In Java JDK; the try-catch blocks use the Chain Of Responsibility Design Pattern. 		java.util.logging.Logger log() method		javax.servlet.Filter doFilter() method.

		
### Chain Of Responsibility Design Pattern has the following elements:
1. <b>Client:</b> Main Class code making user requests.
2. <b>Handler:</b> Abstract superclass or an interface defining the request handler method.
3. <b>Concrete Handler:</b> Class implementation for the Handler.


### Advantages of Chain Of Responsibility Design Pattern:
- Decouples the sender of the request and its receivers.
- Simplifies the object, it does not know about all the receiving members, just a reference to the successor.	


### Disadvantages of Chain Of Responsibility Design Pattern:
- Not guaranteed to execute the request that may fall off the end of the chain of receivers.
	
	
### Examples and Projects:
- Project:	[Purchase Power System.](/src/main/java/behavioralDesignPatterns/chainOfResponsibilityDesignPattern/projectPurchasePowerSystem/Main/Client.java)		
- Project:	[ATM Money Dispenser.](/src/main/java/behavioralDesignPatterns/chainOfResponsibilityDesignPattern/projectATMMoneyDispenser/Main/Main.java)
- Project:	[Error Handling.](/src/main/java/behavioralDesignPatterns/chainOfResponsibilityDesignPattern/projectErrorHandling/Main/Main.java)