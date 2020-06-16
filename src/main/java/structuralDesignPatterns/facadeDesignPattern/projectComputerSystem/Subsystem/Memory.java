package structuralDesignPatterns.facadeDesignPattern.projectComputerSystem.Subsystem;

public class Memory {
    public void loadDataToLocation(long location, byte[] data) { System.out.println("\tMemory loaded " + new String(data) + " to memory location: " + location); }
}
