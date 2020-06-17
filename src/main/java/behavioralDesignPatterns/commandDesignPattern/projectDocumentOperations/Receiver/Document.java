package behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Receiver;

public class Document {

  public void insert(String string, int position) { System.out.println("\tInserting " + string + " at position " + position + "."); }

  public String delete(int position, int noOfChars) { System.out.println("\tDeleting " + noOfChars + " characters from position " + position + "."); 	return "Deleted-String";	}

  public void copy(int position, int noOfChars) { System.out.println("\tCopying " + noOfChars + " characters from position " + position + "."); 	}
}
