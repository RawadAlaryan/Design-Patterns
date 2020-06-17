package behavioralDesignPatterns.mementoDesignPattern.projectTextEditor.Main;

import behavioralDesignPatterns.mementoDesignPattern.projectTextEditor.CareTaker.FileWriterCaretaker;
import behavioralDesignPatterns.mementoDesignPattern.projectTextEditor.Originator.FileWriterUtil;

//Memento Design Pattern Text Editor.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Memento Design Pattern Text Editor.\n");
    	
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First Set of Data:\nMyra\nLucy\n");

        //Save the file:
        caretaker.save(fileWriter);
        
        System.out.println(fileWriter+"\n\n");

        //Now, we write something else:
        fileWriter.write("Second set of data:\nJason\n");

        //Checking file contents:
        System.out.println(fileWriter+"\n\n");

        //Lets undo to last save:
        caretaker.undo(fileWriter);

        //Checking file content again:
        System.out.println(fileWriter+"\n\n");
    }
}
