### Command Design Pattern:
- It is a Behavioral Design Pattern. 
- It encapsulates a command request as an object, thereby letting the designer parametrize clients with different requests, queue or log requests, and support undoable operations.
- It promotes "invocation of a execute() method on a Receiver object" to full object status. It is an object-oriented callback.
- It supports queuing these requests as well as undoing these requests with unexecute() method.
- It supports logging these requests and changes so that they can be re-applied in case of a system crash.
- It is a data-driven design pattern. It is widely used for undo/redo operations.
- Command Design Pattern is helpful to be used as a model for data transactions, money transactions, purchasing orders, undo/redo operations.
- A Command Design Pattern Class provides the implementation of these methods:
<b>execute():</b> 			Method that does the work that needs to be done.
<b>	unexecute():</b> 		Method for undoing the done operation.
<b>isReversible():</b> 	Method should return true if the command can be undone, false otherwise.
<b>callback():</b>			Method for redoing operations.
	
	
### Command Design Pattern has the following elements:
1. Command: Abstract class defining operations for Commands. It sits between the sender and the receiver objects. Sender creates a Command that calls the Receiver. 
2. Concrete Command: Classes that hold the actual implementation for a specific Command.
3. Invoker: Class exposed to the client. It invokes the appropriate Command to complete a task.
4. Receiver: It is invoked by a Command to perform the requested operation.   
We can also have a Command Manager which keeps track of commands, invokes and manipulates them.


### Examples and Projects:
- Project:	[Document Operations.](/src/main/java/behavioralDesignPatterns/commandDesignPattern/projectDocumentOperations/Main/Main.java)
- Project:	[Game Moves.](/src/main/java/behavioralDesignPatterns/commandDesignPattern/projectGameMoves/Main/Main.java)
- Project:	[Remote Controller.](/src/main/java/behavioralDesignPatterns/commandDesignPattern/projectRemoteController/Main/Main.java)
- Project:	[File System Utility.](/src/main/java/behavioralDesignPatterns/commandDesignPattern/projectFileSystemUtility/Main/Main.java)
- Project:	[Stock Market.](/src/main/java/behavioralDesignPatterns/commandDesignPattern/projectStockMarket/Main/Main.java)