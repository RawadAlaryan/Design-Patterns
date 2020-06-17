package behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Invoker;

import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.ConcreteCommand.CommandManager;
import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.ConcreteCommand.CopyCommand;
import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.ConcreteCommand.CutCommand;
import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.ConcreteCommand.PasteCommand;
import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Receiver.Document;

public class DocumentInvoker {
 
    private Document document;
    private CommandManager commandManager;
 
    public DocumentInvoker(Document document) {
        this.document = document;
        commandManager = CommandManager.getInstance();
    }
 
    public CommandManager getCommandManager() { return commandManager; }

	public void cut(int position, int length) {		
        Command cutCommand = new CutCommand(document, position, length);
        commandManager.invoke(cutCommand);
    }
 
    public void copy(int position, int length) {
        Command copyCommand = new CopyCommand(document, position, length);
        commandManager.invoke(copyCommand);
    }
 
   public void paste(String text, int position) {
        Command pasteCommand = new PasteCommand(document, text, position);
        commandManager.invoke(pasteCommand);
    }
}
