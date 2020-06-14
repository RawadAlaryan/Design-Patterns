package BehavioralDesignPatterns;
/**
Command Design Pattern:
	It is a Behavioral Design Pattern. 
	It encapsulates a command request as an object, thereby letting the designer parametrize clients with different requests, queue or log requests, and support undoable operations.
	It promotes "invocation of a execute() method on a Receiver object" to full object status. It is an object-oriented callback.
	It supports queuing these requests as well as undoing these requests with unexecute() method.
	It supports logging these requests and changes so that they can be re-applied in case of a system crash.
	It is a data-driven design pattern. It is widely used for undo/redo operations.
	Command Design Pattern is helpful to be used model data transactions, money transactions, purchasing orders, undo/redo operations.
	A Command Design Pattern Class provides the implementation of these methods:
					execute(): 			Method that does the work that needs to be done
					unexecute(): 		Method for undoing the done operation.
					isReversible(): 	Method should return true if the command can be undone, false otherwise.
					callback():			Method for redoing operations.
	In Command Design Pattern we have the following elements:
		1. Command: Abstract class defining operations for Commands. It sits between the sender and the receiver objects. Sender creates a Command that calls the Receiver. 
		2. ConcreteCommand: Classes that hold the actual implementation for a specific Command.
		3. Invoker: Class exposed to the client. It invokes the appropriate Command to complete a task.
		4. Receiver: It is invoked by a Command to perform the requested operation.   
	We can also have a Command Manager which keeps track of commands, invokes and manipulates them.

Project:	Command Design Pattern Document Operations.
Project:	Command Design Pattern Game Moves.
Project:	Command Design Pattern Remote Controller.
Project:	Command Design Pattern File System Utility.
Project:	Command Design Pattern Stock Market.
*/
public class CommandDesignPattern {	}
