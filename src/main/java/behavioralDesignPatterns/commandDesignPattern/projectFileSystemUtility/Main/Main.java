package behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.Main;

import behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.ConcreteCommand.CloseFileCommand;
import behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.ConcreteCommand.OpenFileCommand;
import behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.ConcreteCommand.WriteFileCommand;
import behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.Invoker.FileInvoker;
import behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.Receiver.FileSystemReceiver;
import behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.Receiver.FileSystemReceiverUtil;

//Command Design Pattern File System Utility.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Command Design Pattern File System Utility.\n");
    	    	
        //Creating the Receiver:
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //Create the Command with the associating Receiver:
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        //Creating Invoker and associate it with the Command:
        FileInvoker file = new FileInvoker(openFileCommand);

        //Perform action on Invoker object:
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
