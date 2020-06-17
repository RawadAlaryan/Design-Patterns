package behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.ConcreteCommand;

import java.util.List;
import java.util.Stack;

import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Command.Command;

//CommandManager is the class that manages the History and the Redo-Lists. 
//The invoker instantiates the commandManager object with the information it needs and then calls the commandManager to perform the operation.
public class CommandManager {
	private static CommandManager commandManager;
	private static List<Command> cutCommandsStack;
	private static List<Command> copyCommandsStack;
	private static List<Command> pasteCommandsStack;
	
	public static List<Command> getCutCommandsStack() { return cutCommandsStack; }
	public static List<Command> getCopyCommandsStack() { return copyCommandsStack; 	}
	public static List<Command> getPasteCommandsStack() { return pasteCommandsStack; }

	public static CommandManager getInstance() { 
		if(commandManager == null) { commandManager = new CommandManager(); }
		cutCommandsStack = new Stack<Command>();
		copyCommandsStack = new Stack<Command>();
		pasteCommandsStack = new Stack<Command>();
		return commandManager; 
	}

	public void invoke(Command command) { 
		switch (command.getType()) { 
			case "CUT": cutCommandsStack.add(command);				break;
			case "COPY": copyCommandsStack.add(command);		break;
			case "PASTE": pasteCommandsStack.add(command);		break;
		}																																	
		command.execute(); 
	}
}
