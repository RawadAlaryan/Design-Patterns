package behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Receiver.Document;

public class PasteCommand implements Command {
	 
    private Document document;
    private String text;
    private int startPosition;
 
    public PasteCommand(Document document, String text, int position) {	
    	this.document = document;
    	this.text = text;
    	this.startPosition = position;
    }		
 
    public void execute() { this.document.insert(text, startPosition); }
 
    public void unexecute() { this.document.delete(startPosition, text.length()); }

	@Override
	public String getType() { return "PASTE"; }
}
