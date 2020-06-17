### State Design Pattern:
- It is a Behavioral Design Pattern.
- It alters an object's behavior when its internal state changes. The object will appear to change its class.
- It used in designing an object-oriented finite state machine FSM, Traffic Signals.
	
	
### State Design Pattern has the following elements:
1. State: An abstract Class or an Interface for declaring the minimum expected functionality for each Concrete State Object.
2. Concrete State: Implementation Classes for the State.
3. Context: A Class  for maintaining the current state instance. It also delegates the responsibility to the concrete state classes to perform a task.


### Examples and Projects:
- Project:	[Vending Machine.](/src/main/java/behavioralDesignPatterns/stateDesignPattern/projectVendingMachine/Main/Main.java)
- Project:	[Mobile Alerts.](/src/main/java/behavioralDesignPatterns/stateDesignPattern/projectMobileAlerts/Main/Main.java).