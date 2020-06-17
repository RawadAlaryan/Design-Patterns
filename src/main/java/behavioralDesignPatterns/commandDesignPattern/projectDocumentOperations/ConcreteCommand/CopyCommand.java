package behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Receiver.Document;

public class CopyCommand implements Command {
 
    private Document document;
    private int startPosition;
    private int length;
 
    public CopyCommand(Document document, int startPosition, int length) {
    	this.document = document;
    	this.startPosition = startPosition;
    	this.length = length;
    }
 
    public void execute() { this.document.copy(startPosition, length); }
 
    public void unexecute() { System.out.println("Uncopy operation is blocked"); }
 
    public boolean isReversible() { return false; }

	@Override
	public String getType() { return "COPY"; }
}
