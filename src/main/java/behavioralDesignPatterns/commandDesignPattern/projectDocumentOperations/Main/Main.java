package behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Main;

import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.ConcreteCommand.CommandManager;
import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Invoker.DocumentInvoker;
import behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Receiver.Document;

//Command Design Pattern Document Operations.
//Document is a Receiver that receives Document Commands (Copy, Cut, Paste) which are invoked by Document Invoker.

public class Main {

    public static void main(String[] args) {
    	System.out.println("Command Design Pattern Document Operations.");
    	System.out.println("Document is a Receiver that receives Document Commands (Copy, Cut, Paste) which are invoked by Document Invoker:\n");
    	
        //Create Document as Receiver:
        Document document = new Document();
        System.out.println("Creating a Document.");

        //Create Document Invoker for editing the Document:
        DocumentInvoker documentInvoker = new DocumentInvoker(document);
        System.out.println("Creating a Document Invoker.");
        
        System.out.println("\nEditing the Document:");
        	System.out.println("\nCutting Command for 20 characters starting from position 10.");
        	documentInvoker.cut(10, 20);
        	System.out.println("\nCopying Command for 40 characters starting from position 30.");
        	documentInvoker.copy(30, 40);
        	System.out.println("\nPasting Command for String \"Hello Design Pattern\" to position 50.");
        	documentInvoker.paste("Hello Design Pattern!", 50);
        	
        System.out.println("\nSummary of Docment Operations:");
        	System.out.println("\tNo. of Cut Commands in Document:\t\t" + CommandManager.getCutCommandsStack().size());
        	System.out.println("\tNo. of Copy Commands in Document:\t" + CommandManager.getCopyCommandsStack().size());
        	System.out.println("\tNo. of Paste Commands in Document:\t" + CommandManager.getPasteCommandsStack().size());
    }
}
