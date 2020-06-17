### Memento Design Pattern:
- It is a Behavioral Design Pattern.
- It captures and externalize an object's internal state so that the object can be restored to this state without violating encapsulation.
- It is a magic cookie that encapsulates a "check point" capability.
- It promotes "undo" or "rollback" to full object status.
- Usage Applications: Ctrl-Z in Text Editor, State in a Finite State Machine FSM, Rollback operation in Database transaction. Save and Load game progress.
	
	
### Memento Design Pattern, we have the following elements:
1. <b>Memento:</b>	Interface for keeping a state for the Originator for future undoing.
2. <b>Originator:</b>			Class for which we need a Memento. Originator's state is stored and restored.
3. <b>Care Taker:</b>		Class that holds the Memento objects for different states of the Originator. It is responsible for storing and restoring the Originator's state through the Memento.



### Advantages of Memento Design Pattern:
- Simple and Easy to implement.
	
	
### Examples and Projects:
- Project:	[Recovery System.](/src/main/java/behavioralDesignPatterns/mementoDesignPattern/projectRecoverySystem/Main/Main.java)		
- Project:	[Text Editor.](/src/main/java/behavioralDesignPatterns/mementoDesignPattern/projectTextEditor/Main/Main.java).
- Project:	[State Storing and Restoring.](/src/main/java/behavioralDesignPatterns/mementoDesignPattern/projectStateStoringAndRestoring/Main/Main.java).
