package behavioralDesignPatterns.commandDesignPattern.projectDocumentOperations.Command;

public interface Command {
      public void execute();
      public void unexecute();
      public default boolean isReversible() { return true; }
      public String getType();
}
