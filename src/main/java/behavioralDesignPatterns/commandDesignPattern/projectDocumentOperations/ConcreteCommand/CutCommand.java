package behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Receiver.Document;

public class CutCommand implements Command {

    private Document document;
    private String text;
    private int startPosition;
    private int length;

    public CutCommand(Document document, int startPosition, int length) {
    	this.document = document;
    	this.startPosition = startPosition;
    	this.length = length;
    }	

    public void execute() { this.text = this.document.delete(startPosition, length); }

    public void unexecute() { this.document.insert(text, startPosition); }

	@Override
	public String getType() { return "CUT"; }
}
